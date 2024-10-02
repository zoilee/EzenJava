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
				<th>제목</th>
				<th>글쓴이</th>
				<th>출판사</th>
				<th>출판날짜</th>
				<th>ISBN</th>
				<th>장르</th>
				<th>가격</th>
				<th>재고</th>
				<th>수정 / 삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${list}">
			<tr>
				<td>${book.title}</td>
				<td>${book.author}</td>
				<td>${book.publisher }</td>
				<td>${book.publishedDate }</td>
				<td>${book.ISBN }</td>
				<td>${book.genre }</td>
				<td>${book.price }</td>
				<td>${book.stock }</td>
				<td>
					<a href="edit?bookId=${book.bookId }">수정</a>/
					<a href="javascript:void(0)" onClick="del(${book.bookId})">삭제</a>
				</td>
			</tr>
			
			</c:forEach>
		</tbody>
	</table>
	<a href="write">도서추가하기</a>
</body>
</html>
<script>
	function del(n){
		let r = confirm("정말 삭제하시겠습니까?");
		if(r){
			location.href="delete?bookId="+n;
		}
	}
</script>
