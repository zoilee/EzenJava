package kdtweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kdtweb.dao.MySqlConnect;


@WebServlet("/finduserid")
public class Finduserid extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int count = 0;
		String id = "";
		
		PrintWriter out = response.getWriter();
		
		MySqlConnect dbCon = new MySqlConnect();
		String findUserId = request.getParameter("useremail");
		try {
			conn = dbCon.getConn();
			String sql = "select userid from members where useremail = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, findUserId);
			
			rs = pstmt.executeQuery();
			System.out.println("db접속 성공");
			while(rs.next()) {
			id = rs.getString(1);
			
					
			}
			String query = "<script>alert('회원님의 아이디는 : " + id +" 입니다.'); location.href='findidpass.jsp';</script>";
			out.println(query);
			
		}catch(SQLException | ClassNotFoundException e){
			System.out.println("db 접속 에러" + e.getMessage());
		}finally {
			if(rs !=null) try {rs.close();}catch(SQLException e) {}
			if(pstmt !=null) try {pstmt.close();}catch(SQLException e) {}
			if(conn !=null) try {conn.close();}catch(SQLException e) {}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
