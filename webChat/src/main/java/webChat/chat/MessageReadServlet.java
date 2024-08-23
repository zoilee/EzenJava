package webChat.chat;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MessageReadServlet
 */
@WebServlet("/messages")
public class MessageReadServlet extends HttpServlet {
	
	private String filePath;
	public void init() throws ServletException{
		ServletContext context = getServletContext();
		filePath = context.getRealPath("/chat/message.txt");
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><meta http-equiv='refresh' content='3'></head><body>");
		//메세지를 읽어옴
		try(BufferedReader br = new BufferedReader(new InputStreamReader(
			new FileInputStream(this.filePath), "UTF-8"))){
			String line;
			while((line = br.readLine()) !=null) {
				response.getWriter().println(line + "<br>");
			}
		}catch(IOException e) {
			response.getWriter().println("채팅 메세지를 불러오는데 오류가 났다");
		}
		out.println("++++++++++++++++++++++");
		out.println("</body></html>");
		out.close();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public void destory() {
		try(FileWriter w = new FileWriter(this.filePath, false)){
			w.write(""); //파일 초기화
			System.out.println("파일 내용이 삭제됨");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
