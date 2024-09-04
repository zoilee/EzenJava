package kdtweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kdtweb.dao.members.AdminEditMem;
import kdtweb.dao.members.DeleteMem;
import kdtweb.dao.members.UpdateMem;

/**
 * Servlet implementation class adminedt
 */
@WebServlet("/adminedt")
public class AdminEdt extends HttpServlet {
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		String reid = request.getParameter("id");
		String lv = request.getParameter("lv");
		int id=0, grade=0;
		if(reid != null && !reid.isEmpty())  id = Integer.parseInt(reid);
		if(lv !=null && !lv.isEmpty()) grade = Integer.parseInt(lv);		
		
		UpdateMem upmem = new UpdateMem();
		DeleteMem delmem = new DeleteMem();
		int res = 0;
		try{
			
			if(grade == 99) {
				res = delmem.deleteMem(id);
				
			}else {
				res = upmem.adminMemEdit(id, grade);
			}
			
			out.print(res);
			
		}catch(SQLException e){
			e.printStackTrace();
		}						
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
