<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>LOGIN</h1>
	<form action="${pageContext.request.contextPath}/login" method="post">
		<label>아이디</label>
		<input type="text" id="username" name="username" /><br>
		<label>비밀번호</label>
		<input type="password" id="password" name="password" /><br>
		<button type="submit">전송</button>
		
		<!-- csrf -->
		<input type="hidden" name="${_csrf.parameterName}"value="${_csrf.token }">
	</form>
	<c:if test="${not empty param.error}">
		<p style="color:red;">아이디 또는 패스워드가 틀렸습니다.</p>
	</c:if>
</body>
</html>