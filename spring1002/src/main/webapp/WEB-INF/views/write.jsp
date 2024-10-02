<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>write</h1>
	<form name="form" action="write" method="post">
		<ul>
				<label for="">제목</label>
				<input type="text" name="title" value="${book.title}" />
			<li>
				<label for="">글쓴이</label>
				<input type="text" name="author" value="${book.author}" />
			</li>
			<li>
				<label for="">출판사</label>
				<input type="text" name="publisher" value="${book.publisher}" />
			<li>
				<label for="">출판날짜</label>
				<input type="date" name="publishedDate" value="${fn:substring(book.publishedDate.toString(), 0, 10)}" />
			</li>
			<li>
				<label for="">ISBN</label>
				<input type="text" name="ISBN" value="${book.ISBN}" />
			<li>
				<label for="">장르</label>
				<input type="text" name="genre" value="${book.genre}" />
			</li>
			<li>
				<label for="">가격</label>
				<input type="number" name="price" value="${book.price}" />
			<li>
				<label for="">재고</label>
				<input type="number" name="stock" value="${book.stock}" />
			</li>
		</ul>
		<button type="submit">전송</button>
	</form>
</body>
</html>