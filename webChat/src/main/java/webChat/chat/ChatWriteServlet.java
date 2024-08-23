package webChat.chat;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class chatWriteServlet
 */
@WebServlet("/write")
public class ChatWriteServlet extends HttpServlet {

	//메세지 절대경로


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		String filePath = context.getRealPath("/chat/message.txt");
		System.out.println(filePath);
		request.setCharacterEncoding("utf-8");
		//사용자이름, 메세지, first
		String username = request.getParameter("username");
		String first = request.getParameter("first");
		String message = request.getParameter("message");
		if( first !=null && username !=null) {
			message = username + "님이 입장하셨습니닷";
		}else if(username != null && message != null && !message.trim().isEmpty()) {
			message = "["+username+"] " + message;
		}
		
		//
		try(
			PrintWriter pw = new PrintWriter(
					new BufferedWriter(
						new OutputStreamWriter(
							new FileOutputStream(filePath, true), "utf-8"
						)
					)
				)		
			){
				pw.println(message);
			}catch(IOException e) {
				e.printStackTrace();
			}
		String encodeUsername = URLEncoder.encode(username, "UTF-8");
			//서블릿에서 자동으로 페이지 이동
		response.sendRedirect("chat?username=" + encodeUsername);
	}
//	        try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath), "UTF-8"))){
//	            writer.write(message);
//	            writer.newLine();
//	        }catch(IOException e) {
//	           e.printStackTrace();
//	        }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
