package web03.sec01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContext2Exam
 */
@WebServlet(
		description = "파라미터 지정",
		urlPatterns = {"/ct"},
		initParams = {
				@WebInitParam(name="username", value="홍길동"),
				@WebInitParam(name="age", value= "30")
		}
)
public class ServletContext2Exam extends HttpServlet {



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		ServletContext context = this.getServletContext();
		String username = getInitParameter("username");
		String age = getInitParameter("age");
		
		out.println("이름 : " + username);
		out.println("나이 : " + age);
		//out.println("사람 : " + context.getAttribute("person"));
		//out.println("영웅 : " + context.getAttribute("hero"));
		out.close();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
