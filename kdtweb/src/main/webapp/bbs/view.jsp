<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="kdtweb.dao.bbs.Board, kdtweb.beans.BoardDto, java.sql.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%
  String stringNum = request.getParameter("num");

  if(stringNum != null && !stringNum.isEmpty()){
  long num = Long.parseLong(stringNum);
  int currentPage = 1;
  if(request.getParameter("pg") != null){
		currentPage = Integer.parseInt(request.getParameter("pg"));
  }

  BoardDto boardView = null;
  Board bbs = new Board();
  try{
	  
	bbs.updateCount(num);  
    boardView = bbs.viewBoard(num);

    
  }catch(SQLException e){
     e.printStackTrace();
     
  }
  request.setAttribute("currentPage", currentPage);
  request.setAttribute("boardView", boardView);
%>
<section class="view">
	<div class="view-box">
		<div class="view-head">
			<i class="ri-arrow-right-circle-fill"></i> 
			${boardView.title }
		</div>
		<div class="view-body">
			<div class="contents-box">
				<div class="wdate"><i class="ri-calendar-2-line"></i> ${boardView.wdate }</div>
				<div class="writer"><i class="ri-user-voice-line"></i> ${boardView.writer }</div>
				<div class="count"><i class="ri-anticlockwise-2-line"></i> ${boardView.count }</div>          
			</div>
			<div class="contents">
				<p>${boardView.contents}</p>
			</div>
		</div>
		<div class="view-foot">
			<a href="?mode=list&pg=${currentPage}" class="btn btn-success mr-2">목록</a>
			<a href="?mode=pass&bmode=edit&num=${boardView.num }&pg=${currentPage}" class="btn btn-warning mr-2">수정</a>
			<a href="?mode=pass&bmode=del&num=${boardView.num }&pg=${currentPage}" class="btn btn-danger mr-2">삭제</a>
			<a href="?mode=write&pg=${currentPage}" class="btn btn-success">글쓰기</a>
		</div>
	</div>
</section>

<% }else{ %>
  <script>
   alert("이러지 말아다오");
   location.history.go(-1);
  </script>
<%     
  }
%>
<!-- 
<h1 class="text-center mb-5">
   게시판
</h1>
<div class="contain my-5">
	<div class="title">
		<h4>${bbsDto.title}</h4>
		<p class="d-inline p-2"><span class="mx-2">글쓴이 들어가요</span><span class="mx-2" >시간들어가요</span><span class="mx-2" >조회수 들어가요</span></p>
	</div>
	<div class="content my-5">
		<p>본문 들어가요</p>
	</div>
</div>
-->