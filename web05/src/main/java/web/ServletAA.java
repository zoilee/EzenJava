package web;

import jav.User;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletAA
 */
@WebServlet("/sa")
public class ServletAA extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//User객체 생성
		User user = new User();
		user.setName("Lebron James");
		user.setAge(41);
		user.setAddress("gimpo city");
		
		request.setAttribute("user", user);
		
		//sb로 포워딩
		RequestDispatcher dis = request.getRequestDispatcher("/sb");
		dis.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
