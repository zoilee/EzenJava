package web01.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet({ "/Login", "/login" })
public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String userid = "admin";
		String userpass = "1234";
		String yname = request.getParameter("yname");
		String ypass = request.getParameter("ypass");
		
		PrintWriter out = response.getWriter();
		if(userid.equals(yname) && userpass.equals(ypass)) {
			out.println("<html><header></header><body>");
			out.println("<p>환영합니다!</p>");
			out.println("</body></html>");
		}else {
			out.println("<html><header></header><body>");
			out.println("<p>아이디 및 비밀번호가 틀렸습니다.</p>");
			out.println("</body></html>");
		}

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
