package webChat.chat;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/chat")
public class ChatMainInput extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		String htmlData="<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>welcome Chat</title>\r\n"
				+ "<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\r\n"
				+ "<link rel=\"stylesheet\" href=\"css/style.css\" />\r\n"
				+ "<script src=\"js/jquery-1.12.4.min.js\"></script>\r\n"
				+ "<script src=\"js/poper.min.js\"></script>\r\n"
				+ "<script src=\"js/bootstrap.min.js\"></script>\r\n"
				+ "<script src=\"js/script.js\"></script>\r\n"
				+ "</head>\r\n"
				+ "<body>";
		//JSON 객체 생성
		
		
		String username = request.getParameter("username");
		String first = request.getParameter("first");
		out.println(htmlData);
		out.println("<div class='container p-4'>");
		out.println("<div class=\"iframe\"><iframe src='http://daum.net'></iframe></div>");
		out.println("<input type='hidden' name='username' value='"+username+"'>");
		out.println("<input type='hidden' name='first' value='"+first+"'>");
		out.println("<input type='text' name='message' class='form-control>");
		out.println("</body></html>");
		out.close();
	} 


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
