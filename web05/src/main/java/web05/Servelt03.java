package web05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet03")
public class Servelt03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String str = "HI_My_Name is" + request.getParameter("str");
	//	response.sendRedirect("servelt02?str="+str);
		
	//	String str =request.getParameter("str0");
		
		PrintWriter out = response.getWriter();
		out.println("<html><head></head><body>");
		out.println("<script>document.location.href='servlet02?str="+str+"';</script>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
