<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    import="kdtweb.dao.bbs.Board, kdtweb.beans.BoardDto, java.sql.*, java.util.*, kdtweb.util.Paging" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<%
    int totalRecords = 0;
	int recordsPerPage = 10;
	int pagesPerGroup = 10;
	int currentPage = 1;
	
	
	
	
	if(request.getParameter("pg") != null){
		currentPage = Integer.parseInt(request.getParameter("pg"));
	}
	int limit = (currentPage - 1) * recordsPerPage;
   Board bbs = new Board();
   ArrayList<BoardDto> boardList = null;
   try{
	  totalRecords = bbs.getTotalBoardCount();
      boardList = bbs.listBoard(limit, recordsPerPage);
      
   }catch(SQLException e){
      e.printStackTrace();
   }
   
   Paging paging = new Paging(totalRecords, recordsPerPage, currentPage, pagesPerGroup);
   
   request.setAttribute("paging", paging);
   request.setAttribute("boardList", boardList);
%>
<h1 class="text-center mb-5">
   게시판
</h1>
   <table class="bbslist table-hover" >
      <colgroup>
        <col width="10%">
        <col width="50%">
        <col width="15%">
        <col width="15%">
        <col width="10%">
      </colgroup>
      <thead>
       <tr>
         <th>번호</th>
         <th>제목</th>
         <th>작성자</th>
         <th>날짜</th>
         <th>조회수</th> 
       </tr>
      </thead>
      <tbody id="display">
        <c:forEach var="post" items="${boardList }">
        <!-- 루프 -->
        <tr>
           <td class="text-center">${post.num }</td>
           <td class="ellipsis"><a href="bbs.jsp?mode=view&num=${post.num}&pg=${paging.currentPage}">${post.title }</a> </td>
           <td class="ellipsis text-center">${post.writer }</td>
           <td class="text-center">${post.viewDate }</td>
           <td class="text-center">${post.count }</td>
        </tr>
        <!-- /루프 -->
        </c:forEach>
      </tbody>
   </table>
   <!-- <div id="table"></div> -->

   <div class="text-right my-3 px-5">
     <a href="?mode=write" class="btn btn-success">글쓰기</a>
   </div>
		<ul class="pagination justify-content-center">
		<li class="page-item"><a class="page-link bg-light" href="?pg=1"><i class="ri-arrow-left-double-line"></i></a></li>
		<!--  이전그룹 -->
		<c:if test="${paging.startPageOfGroup > 1}">
			<li class="page-item"><a class="page-link" href="?pg=${paging.startPageOfGroup -1}"><i class="ri-arrow-left-s-line"></i></a></li>
		</c:if>
		
		<c:forEach var="i" begin="${paging.startPageOfGroup}" end="${paging.endPageOfGroup}">
			<li class="page-item <c:if test='${i==paging.currentPage}'>active</c:if>"><a class="page-link" href="?pg=${i}">${i}</a></li>
		</c:forEach>
		
		<!--  다음 그룹 -->
		<c:if test="${paging.endPageOfGroup < paging.totalPages}">
			<li class="page-item"><a class="page-link" href="?pg=${paging.endPageOfGroup + 1}"><i class="ri-arrow-right-s-line"></i></a></li>
		</c:if>
		<li class="page-item"><a class="page-link" href="?pg=${paging.totalPages}"><i class="ri-arrow-right-double-line"></i></a></li>
		</ul>   
   <script>
   		var dbBoard = new Array();
   		<c:forEach var="post" items="${boardList }">
   			dbBoard.push({num:"${post.num}", title:"${post.title}", writer:"${post.writer}", viewDate:"${post.viewDate}", count:"${post.count}"})
        </c:forEach>
    </script>
