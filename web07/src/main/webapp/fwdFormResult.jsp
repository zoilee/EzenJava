<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String links = "fwdFormResultTo.jsp";
%>

	<jsp:forward page="<%=links %>">
		<jsp:param value="김철수" name="name"/>
		<jsp:param name="age" value="30"/>
	</jsp:forward>
</body>
</html>