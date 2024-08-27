<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:forward page="index.jsp"/>
	<%@ include file="header.jsp" %>
	<div class="main">서브페이지입니당.</div>
	<%@ include file="footer.jsp" %>
</body>
</html>