<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.zoile.board.model.BoardDto,com.zoile.board.util.Paging, java.sql.*, java.util.*, java.net.URLEncoder" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	int recordsPerPage = 10;
	int pagesPerGroup = 10;
	int currentPage = 1;
	
	if (request.getParameter("pg") != null) {
	    currentPage = Integer.parseInt(request.getParameter("pg"));
	}
	if (currentPage < 1) {
	    currentPage = 1;
	}
	
	int limit = (currentPage - 1) * recordsPerPage;
	
	Paging paging = (Paging) request.getAttribute("paging");
	List<BoardDto> boardList = (List<BoardDto>) request.getAttribute("list");
	
	int totalRecords = (paging != null) ? paging.getTotalRecords() : 0;
	

%>
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
				<th>제목</th>
				<th>내용</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>수정 / 삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="board" items="${list}">
			<tr>
				<td>${board.id}</td>
				<td><a href="view?id=${board.id}">${board.title}</a></td>
				<td>${board.content }</td>
				<td>${board.writer}</td>
				<td>${board.viewDate }</td>
				<td>
					<a href="edit?id=${board.id }">수정</a>/
					<a href="javascript:void(0)" onClick="del(${board.id})">삭제</a>
				</td>
			</tr>
			
			</c:forEach>
		</tbody>
	</table>
	<a href="write">글쓰기</a>
	<div class="pagination">
		<c:if test="${paging != null}">
			<c:if test="${paging.currentPage > 1}">
				<a href="?pg=${paging.currentPage - 1}">이전</a>
			</c:if>
			<c:forEach var="page" begin="${paging.getStartPageOfGroup()}" end="${paging.getEndPageOfGroup()}">
				<c:if test="${page == paging.currentPage}">
					<strong>${page}</strong> 
				</c:if>
				<c:if test="${page != paging.currentPage}">
					<a href="?pg=${page}">${page}</a>
				</c:if>
			</c:forEach>
			<c:if test="${paging.currentPage < paging.totalPages}">
				<a href="?pg=${paging.currentPage + 1}">다음</a>
			</c:if>
		</c:if>
    </div>
</body>
</html>
<script>
	function del(n){
		let r = confirm("정말 삭제하시겠습니까?");
		if(r){
			location.href="delete?id="+n;
		}
	}
</script>
