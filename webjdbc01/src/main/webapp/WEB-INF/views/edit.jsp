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
	<h1>edit</h1>
	<form name="form" action="edit" method="post">
		<ul>
			<li>
				<label for="">이름</label>
				<input type="text" name="name" />
			<li>
				<label for="">이메일</label>
				<input type="text" name="email" />
			</li>
		</ul>
		<input type="hidden" name="num" value="${mem.num}" />
		<button type="submit">전송</button>
	</form>
</body>
</html>