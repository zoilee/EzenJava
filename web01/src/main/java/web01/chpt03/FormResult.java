package web01.chpt03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormResult
 */
@WebServlet("/act")
public class FormResult extends HttpServlet {



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//요청으로 받은 값을 utf-8 로 인코딩 (한글 깨짐 방지)
		request.setCharacterEncoding("UTF-8");
		//응답의 Content-type의 인코딩
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println("<html><header></header><body>");
		out.println("<p>이름"+request.getParameter("username")+"</p>");
		out.println("</body></html>");
		request.getParameter("username");
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
