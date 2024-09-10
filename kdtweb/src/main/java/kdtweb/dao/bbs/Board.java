package kdtweb.dao.bbs;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import kdtweb.beans.BoardDto;
import kdtweb.dao.KdtwebDao;
import kdtweb.dao.members.CloseResource;

public class Board implements BoardInterface{

   //필드
   private KdtwebDao dao = new KdtwebDao();
   private CloseResource reso = new CloseResource();
   private Connection conn;
   private PreparedStatement pstmt = null;
   private ResultSet rs = null;
   
   @Override
   public int insertBoard(BoardDto bbs) throws SQLException {
      int res = 0;
      
      String sql = "insert into bbs_bbs "
                +" (title, contents, writer, userid, password) "
                +" value (? ,?, ?, ? , ?)";
      try {
         
         conn = this.dao.getConn();
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, bbs.getTitle());
         pstmt.setString(2, bbs.getContents());
         pstmt.setString(3, bbs.getWriter());
         pstmt.setString(4, bbs.getUserid());
         pstmt.setString(5, bbs.getPassword());
         
         res = pstmt.executeUpdate();
         
      }catch(SQLException e) {
         e.printStackTrace();
      }finally {
         reso.closeResource(conn, pstmt);
      }
      
      return res;
   }
   @Override
	public int selectUserId(String userid, int num) throws SQLException {
		int recordCount = 0;
		String sql = "select count(*) as total from bbs_bbs where num=? and userid=?";
		try {
			conn = this.dao.getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, userid);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				recordCount = rs.getInt("total");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
	    }finally {
	    	reso.closeResource(conn, pstmt, rs);
	    }
		
		return recordCount;
	}
@Override
   public int updateBoard(BoardDto bbs) throws SQLException {
      int res = 0;
      String sql = "update bbs_bbs SET title =?, contents=?, writer=? where num =?";
      try{
         conn = this.dao.getConn();
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1,  bbs.getTitle());
         pstmt.setString(2, bbs.getContents());
         pstmt.setString(3, bbs.getWriter());
         pstmt.setLong(4, bbs.getNum());
         
         res = pstmt.executeUpdate();
         
      }catch(SQLException e) {
         e.printStackTrace();
      }finally {
         reso.closeResource(conn, pstmt);
      }
      
      return res;
   }
   
   @Override
   public int updateCount(long num) throws SQLException {
	int res = 0;
	String sql = "update bbs_bbs set count=count+1 where num=?";
	try {
		conn = this.dao.getConn();
		pstmt = conn.prepareStatement(sql);
		pstmt.setLong(1, num);
		res = pstmt.executeUpdate();
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		reso.closeResource(conn, pstmt);
	}
	
   	return res;
   }
   
   @Override
   public int deleteBoard(long num) throws SQLException {
      int res = 0;
      String sql = "delete from bbs_bbs where num=?";
      
      try {
         conn = this.dao.getConn();
         pstmt = conn.prepareStatement(sql);
         pstmt.setLong(1, num);
         res = pstmt.executeUpdate();
         
      }catch(SQLException e) {
         e.printStackTrace();
      }finally {
         reso.closeResource(conn, pstmt);
      }
      
      return res;
   }
   @Override
	public int getTotalBoardCount() throws SQLException {
		int totalRecords = 0;
		String sql = "select count(*) as total from bbs_bbs";
		try {
			conn = this.dao.getConn();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				totalRecords = rs.getInt("total");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
	    }finally {
	    	reso.closeResource(conn, pstmt, rs);
	    }
		
		return totalRecords;
	}
   @Override
   public ArrayList<BoardDto> listBoard(int limit, int recordsPerPage) throws SQLException {
      
      ArrayList<BoardDto> boardList = new ArrayList<>();
      String sql = "select * from bbs_bbs order by num desc limit ?, ?";
      try {
         conn = this.dao.getConn();
         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, limit);
         pstmt.setInt(2, recordsPerPage);
         rs = pstmt.executeQuery();
         
         while(rs.next()) {
            BoardDto bbsDto = new BoardDto();   
            bbsDto.setNum(rs.getLong("num"));      
            bbsDto.setTitle(rs.getString("title"));
            bbsDto.setContents(rs.getString("contents"));
            bbsDto.setWriter(rs.getString("writer"));
            bbsDto.setUserid(rs.getString("userid"));
            bbsDto.setPassword(rs.getString("password"));
            bbsDto.setCount(rs.getInt("count"));
            bbsDto.setWdate(rs.getTimestamp("wdate"));
            
            //1. 출력은 yyyy-mm-dd 이렇게 24시간 이내의 글은 mm-dd 
            Timestamp wdate = rs.getTimestamp("wdate");  
            //wdate를 unix 타임으로 변환
            long wdateMills = wdate.getTime();
            
            //현재 시간을 unix 타임으로 가져옴
            long currentTimeMills = System.currentTimeMillis();
            
            //현재시간에서 글쓴 시간을 빼서 24시간 이내인지 확인
            long diffTime = currentTimeMills - wdateMills;
            long rsDiffTime = diffTime/(60 * 60* 1000); //시간단위로 변환
            
            SimpleDateFormat dateFormat;
            if(rsDiffTime < 24) {
               dateFormat = new SimpleDateFormat("HH:mm");
            }else {
               dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            }
            bbsDto.setViewDate(dateFormat.format(new Date(wdateMills)));
            boardList.add(bbsDto);
         }
         
      }catch(SQLException e) {
         e.printStackTrace();
      }finally {
         reso.closeResource(conn, pstmt, rs);
      }
      System.out.println(boardList);
      return boardList;
   }
   
   
   
   @Override
   public BoardDto viewBoard(long num) throws SQLException {
	   BoardDto bbsDto = null;
	   ResultSet res= null;
	   String sql = "select * from bbs_bbs where num = ?";
	   try{
		   	conn = this.dao.getConn();
	         pstmt = conn.prepareStatement(sql);
	         pstmt.setLong(1, num);
	         res = pstmt.executeQuery();
	         	
	         if(res.next()) {
	        	 bbsDto = new BoardDto();
	        	 bbsDto.setNum(res.getLong("num"));      
	             bbsDto.setTitle(res.getString("title"));
	             bbsDto.setWriter(res.getString("writer"));
	             bbsDto.setContents(res.getString("contents"));
	             bbsDto.setUserid(res.getString("userid"));
	             bbsDto.setPassword(res.getString("password"));
	             bbsDto.setCount(res.getInt("count"));
	             bbsDto.setWdate(res.getTimestamp("wdate"));
	         }
	         
	      }catch(SQLException e) {
	         e.printStackTrace();
	      }finally {
	         reso.closeResource(conn, pstmt);
	      }
	   
	   
      return bbsDto;
   }
@Override
public int inserBoard(BoardDto bbs) throws SQLException {
	// TODO Auto-generated method stub
	return 0;
}

   
   

}

