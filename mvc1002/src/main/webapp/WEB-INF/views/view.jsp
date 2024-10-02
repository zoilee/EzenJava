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
	<h1>게시글 상세보기</h1>
	<c:if test="${board != null}">
		<table border="1">
			<tr>
				<th>번호</th>
				<td>${board.id}</td>
			</tr>
			<tr>
				<th>제목</th>
				<td>${board.title}</td>
			</tr>
			<tr>
				<th>내용</th>
				<td>${board.content}</td>
			</tr>
			<tr>
				<th>작성자</th>
				<td>${board.writer}</td>
			</tr>
			<tr>
				<th>작성일</th>
				<td>${board.viewDate}</td>
			</tr>
		</table>
		<a href="edit?id=${board.id}">수정</a>
		<a href="javascript:void(0)" onClick="del(${board.id})">삭제</a>
	</c:if>
	<c:if test="${board == null}">
		<p>게시글을 찾을 수 없습니다.</p>
	</c:if>
</html>