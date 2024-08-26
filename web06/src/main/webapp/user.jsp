<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	int age = Integer.parseInt(request.getParameter("age"));
	String addr = request.getParameter("addr");
	String[] habbits= request.getParameterValues("habit");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>이름 : <%=name%></p>
	<p>나이 : <%=age-1 %></p>
	<p>주소 : <%=addr %></p>
	<p>취미 : <% for(int i=0; i<habbits.length;i++){
			{out.print(habbits[i] + ", ");
			}}
			%>
	</p>
</body>
</html>