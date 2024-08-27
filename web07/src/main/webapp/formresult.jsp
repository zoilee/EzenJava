<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<jsp:useBean id="form" class="web07.works.form" scope="page"/>
<jsp:setProperty name="form" property="name" value=name/>
<jsp:setProperty name="form" property="id" value=name/>
<jsp:setProperty name="form" property="email" value=name/>
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String email = request.getParameter("email");
	
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:getProperty property="name" name="form"/>
	<jsp:getProperty property="id" name="form"/>
	<jsp:getProperty property="email" name="form"/>
</body>
</html>