<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String uid = request.getParameter("uid");
	String upw = request.getParameter("upw");
	String name = request.getParameter("name");
	String age = request.getParameter("age");
%>
<p>아이디 : <%=uid %></p>
<p>비밀번호 : <%=upw %></p>
<p>이름 : <%=name %></p>
<p>나이 : <%=age %></p>
</body>
</html>