package kdtweb.dao.bbs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kdtweb.beans.User;
import kdtweb.dao.KdtwebDao;
import kdtweb.dao.members.CloseResource;

public class AdminEditMem {
	//필드로 접속객체를 생성
	private KdtwebDao dao = new KdtwebDao();
	private CloseResource reso = new CloseResource();
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private int rs = 0;

	public int adminEditMem(int id, int lv) throws SQLException{

		String sql = "UPDATE members SET grade=? where id=?";
		
		try {
			conn = this.dao.getConn();
			pstmt = conn.prepareStatement(sql);						
			pstmt.setInt(1, lv);
			pstmt.setInt(2, id);
			rs = pstmt.executeUpdate();
			
			System.out.println(rs);

			
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			reso.closeResource(conn, pstmt);
		}
		return rs;
	}
}
