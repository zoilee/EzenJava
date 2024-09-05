package kdtweb.servlet.bbs;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kdtweb.beans.BoardDto;
import kdtweb.dao.bbs.Board;

/**
 * Servlet implementation class BbsWriteOK
 */
@WebServlet("/bbswriteok")
public class BbsWriteOK extends HttpServlet {



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		BoardDto bbsDto = new BoardDto();
		Board bbs = new Board();
		
		//1. request.getParameter
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		String writer = request.getParameter("writer");
		String userid = (String) request.getAttribute("userid");
		String password = request.getParameter("password");
		
		bbsDto.setTitle(title);
		bbsDto.setContents(contents);
		bbsDto.setWriter(writer);
		bbsDto.setUserid(userid);
		bbsDto.setPassword(password);
		int rs = 0;
		try {
			rs = bbs.inserBoard(bbsDto);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write(rs);
		
		//3. insert 메소드에다 전송
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
