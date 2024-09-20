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
	<h1>view</h1>
	<table border="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>이메일</th>
				<th>가입일</th>
				<th>수정 / 삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty mem}">
			<tr>
				<td>${mem.num}</td>
				<td>${mem.name}</td>
				<td>${mem.email }</td>
				<td>${mem.create_at }</td>
				<td><a href="edit?num=${mem.num}">수정</a>/
					<a href="del?num=${mem.num }">삭제</a>
				</td>
			</tr>
			
			</c:if>
		</tbody>
	</table>
</body>
</html>