package web04.sec01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NetForm
 */
@WebServlet("/netform")
public class NetForm extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		out.println("요청URI : " + request.getRequestURI()+"<br>");
		out.println("요청URL : "+ request.getRequestURL()+"<br>");
		out.println("쿼리스트링 : "+ request.getQueryString()+"<br>");
		out.println("컨텍스트 경로 : "+ request.getContextPath()+"<br>");
		out.println("서블릿 경로 : "+ request.getServletPath()+"<br>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
