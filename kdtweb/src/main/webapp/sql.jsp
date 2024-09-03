<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
	import="java.sql.*, java.util.*"        
%>
<jsp:useBean id="connBean" class="kdtweb.dao.KdtwebDao" scope="page"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Connection conn = null;
	Statement st = null;
	ResultSet rs = null;
	
	try{
		conn = connBean.getConn();
		out.println("데이터 베이스 접속 성공");
		String sql = "select * from members order by id desc";
		st = conn.createStatement();
		rs = st.executeQuery(sql);
		
		ArrayList<String> arrayList = new ArrayList<>();
		Vector<String> vector = new Vector<>();
		LinkedList<String> linkedList = new LinkedList<>();
%>
<table>
<%
		while(rs.next()){
			int id = rs.getInt("id");
			String username = rs.getString("username");
			String useremail = rs.getString("useremail");
			String usertel = rs.getString("usertel");
			int userpost = rs.getInt("userpost");
			String useraddr1 = rs.getString("useraddr1");
			String useraddr2 = rs.getString("useraddr2");
			String useraddrexc = rs.getString("useraddrexc");
			
			String rec = "아이디 : " + id + " , 이름 : "+ username;
			arrayList.add(rec);
			vector.add(rec);
			linkedList.add(rec);
			
			for(String res : arrayList){
				out.print(res);
				out.print("<br>");
			}
%>
			<tr>
				<td><%=id %></td>
				<td><%=username %></td>
				<td><%=useremail %>
				<td><%=usertel %></td>
				<td><%=userpost %></td>
				<td><%=useraddr1 %>
				<td><%=useraddr2 %></td>
				<td><%=useraddrexc %></td>			
			</tr>
	
<%
		}
		
%>
</table>
<%	
	}catch(SQLException e){
		out.println("접속 에러" + e.getMessage());
	}finally{
		if(conn != null){
			try{
				conn.close();
			}catch(SQLException e){
				out.println("커넥션을 닫다가 에러가 발생했습니다. " + e.getMessage());
			}
		}
		if(st != null){
			try{
				st.close();
			}catch(SQLException e){
				out.println("커넥션을 닫다가 에러가 발생했습니다. " + e.getMessage());
			}
		}
		if(rs != null){
			try{
				rs.close();
			}catch(SQLException e){
				out.println("커넥션을 닫다가 에러가 발생했습니다. " + e.getMessage());
			}
		}
	}
%>
</body>
</html>