package chpt14.sqlworks;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLDao {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
			 "jdbc:mysql://localhost:3306/workdb",
			 "root",
			 "z1z2z3z4"
			);
			System.out.println("db 접속 성공");
		
			String sql = "select * from new_table order by num desc limit 0, 30";
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
					int id = rs.getInt("num");
					String title = rs.getString("title");
					String writer = rs.getString("writer");
					System.out.println("num: " + id +", title: " + title +", writer: "+writer);
					
			}
		
			
			
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {rs.close();}catch(SQLException e) {}
			if(st != null) try {st.close();}catch(SQLException e) {}
			if(conn!=null) try {conn.close();}catch(SQLException e) {}
		}
		
		
	
	}
	
	
	
	
}
