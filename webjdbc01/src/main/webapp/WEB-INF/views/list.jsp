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
	<h1>list</h1>
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
			<c:forEach var="mem" items="${list}">
			<tr>
				<td>${mem.num}</td>
				<td>${mem.name}</td>
				<td>${mem.email }</td>
				<td>${mem.create_at }</td>
				<td>
					<a href="edit?num=${mem.num }">수정</a>/
					<a href="javascript:void(0)" onClick="del(${mem.num})">삭제</a>
				</td>
			</tr>
			
			</c:forEach>
		</tbody>
	</table>
	<a href="write">글쓰기</a>
</body>
</html>
<script>
	function del(n){
		let r = confirm("정말 삭제하시겠습니까?");
		if(r){
			location.href="delete?num="+n;
		}
	}
</script>
