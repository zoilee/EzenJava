<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    import="kdtweb.dao.bbs.Board, kdtweb.beans.BoardDto, java.sql.*, java.util.*, kdtweb.util.Paging, java.net.URLEncoder" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<%
    int totalRecords = 0;
	int recordsPerPage = 10;
	int pagesPerGroup = 10;
	int currentPage = 1;
	
	
	String searchKey = null;
	String searchInput = null;
	
	if(request.getParameter("pg") != null){
		currentPage = Integer.parseInt(request.getParameter("pg"));
	}
	int limit = (currentPage - 1) * recordsPerPage;
	Board bbs = new Board();
	ArrayList<BoardDto> boardList = null;

	String encodeSearchKey = (searchKey != null)?URLEncoder.encode(searchKey, "UTF-8"):"title";  //데이터값 엔코딩
	String encodeSearchInput = (searchInput != null)?URLEncoder.encode(searchInput, "UTF-8"):"";
	
	
	
	if(request.getParameter("searchKey") != null){
		searchKey = request.getParameter("searchKey");
	};
	if(request.getParameter("searchInput") != null){
		searchInput = request.getParameter("searchInput");
	};	
		
		
	
	if(searchKey != null && !searchKey.isEmpty() && searchInput != null && !searchInput.isEmpty()){
		try{
			
		totalRecords = bbs.getsearchBoardCount(searchKey, searchInput);
		boardList = bbs.searchBoard(searchKey, searchInput,limit, recordsPerPage);
		System.out.println("getsearchcount : " + totalRecords);
		System.out.println("searchkey : " + searchKey);
		System.out.println("searchInput : " + searchInput);
		System.out.println("limit : " + limit);
		System.out.println("currentPage : " + currentPage);
		System.out.println("recordsPerPage : " + recordsPerPage);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}else{
		try{
			totalRecords = bbs.getTotalBoardCount();
			boardList = bbs.listBoard(limit, recordsPerPage);
	      
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	Paging paging = new Paging(totalRecords, recordsPerPage, currentPage, pagesPerGroup);
	
	
	request.setAttribute("paging", paging);
	request.setAttribute("boardList", boardList);
	request.setAttribute("searchKey", searchKey);
	request.setAttribute("searchInput", searchInput);
	   
	   
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
	<div class="search-and-button">
		<div class="col-md-5 searchbox">
			<form id="searchForm" method="get">
				<div class="input-group mt-3 mb-3">
					<div class="input-group-prepend">
						<button type="button" class="btn btn-outline-secondary dropdown-toggle" data-toggle="dropdown" id="search-text">
							제목검색
						</button>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="#" data-search="title">제목검색</a>
							<a class="dropdown-item" href="#" data-search="writer">이름검색</a>
							<a class="dropdown-item" href="#" data-search="contents">내용검색</a>
						</div>
					</div>
					<input type="text" class="form-control" id="searchInput" placeholder="검색어 입력" name="searchInput">
					<input type="hidden" id="searchKey" name="searchKey" value="title"/>
					<div class="input-group-append">
						<button class="btn btn-success" id="searchSubmit" type="submit">Go</button>
					</div>
				</div>
			</form>
		</div>
		<div class="col-md-7 text-right">
		<a href="bbs.jsp" class="btn btn-success">목록</a> <a href="?mode=write" class="btn btn-success">글쓰기</a>
	</div>
   </div>
		<ul class="pagination justify-content-center">
		<li class="page-item"><a class="page-link bg-light" href="?pg=1&searchInput=${searchInput}&searchKey=${searchKey}"><i class="ri-arrow-left-double-line"></i></a></li>
		<!--  이전그룹 -->
		<c:if test="${paging.startPageOfGroup > 1}">
			<li class="page-item"><a class="page-link" href="?pg=${paging.startPageOfGroup -1}&searchInput=${searchInput}&searchKey=${searchKey}"><i class="ri-arrow-left-s-line"></i></a></li>
		</c:if>
		
		<c:forEach var="i" begin="${paging.startPageOfGroup}" end="${paging.endPageOfGroup}">
			<li class="page-item <c:if test='${i==paging.currentPage}'>active</c:if>"><a class="page-link" href="?pg=${i}&searchInput=${searchInput}&searchKey=${searchKey}">${i}</a></li>
		</c:forEach>
		
		<!--  다음 그룹 -->
		<c:if test="${paging.endPageOfGroup < paging.totalPages}">
			<li class="page-item"><a class="page-link" href="?pg=${paging.endPageOfGroup + 1}&searchInput=${searchInput}&searchKey=${searchKey}"><i class="ri-arrow-right-s-line"></i></a></li>
		</c:if>
		<li class="page-item"><a class="page-link" href="?pg=${paging.totalPages}&searchInput=${searchInput}&searchKey=${searchKey}"><i class="ri-arrow-right-double-line"></i></a></li>
		</ul>   
   <script>
   		$(function(){
   			$(".dropdown-item").click(function(e){
   				e.preventDefault();
   				const selectedText = $(this).text();
   				const selectedKey = $(this).data("search");
   				$("#searchKey").val(selectedKey);
   				$("#search-text").text(selectedText);
   				
   			})
			$(".page-link").click(function(){
				
			})
   		
   
   
   		var dbBoard = new Array();
   		<c:forEach var="post" items="${boardList }">
   			dbBoard.push({num:"${post.num}", title:"${post.title}", writer:"${post.writer}", viewDate:"${post.viewDate}", count:"${post.count}"})
        </c:forEach>
    </script>
