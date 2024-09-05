package kdtweb.dao.bbs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
	
	@Override
	public int inserBoard(BoardDto bbs) throws SQLException {
		int rs = 0;
		
		String sql = "insert into bbs_bbs "
					 +" (title, contents, writer) "
					 +" values (? , ? , ?)";
		try {
			
				conn = this.dao.getConn();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, bbs.getTitle());
				pstmt.setString(2, bbs.getContents());
				pstmt.setString(3, bbs.getWriter());
				
				rs = pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			reso.closeResource(conn, pstmt);
		}
		
		return rs;
	}
	@Override
	public int updateBoard(BoardDto bbs) throws SQLException {
		
		return 0;
	}
	@Override
	public int deleteBoard(long num) throws SQLException {
		
		return 0;
	}
	@Override
	public ArrayList<BoardDto> listBoard() throws SQLException {
		
		return null;
	}
	@Override
	public BoardDto viewBoard(long num) throws SQLException {
	
		return null;
	}
	


}
