<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<c:choose>
	<c:when test="${not empty param.logut} }">
		<p>성공적으로 로그아웃 되었습니다.</p>
	</c:when>
	<c:when test="${not empty param.error}">
		<p>아이디 또는 비밀번호가 틀렸습니다.</p>
	</c:when>
</c:choose>
<p>
	<a href="${pageContext.request.contextPath}/login">로그인</a> | 
	<form action="${pageContext.request.contextPath}/logout" method="post">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		<button type="submit">로그아웃</button>
	</form>	
</p>
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
