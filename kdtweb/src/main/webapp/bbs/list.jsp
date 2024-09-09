<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    import="kdtweb.dao.bbs.Board, kdtweb.beans.BoardDto, java.sql.*, java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<%
   Board bbs = new Board();
   ArrayList<BoardDto> boardList = null;
   try{
      boardList = bbs.listBoard();
   }catch(SQLException e){
      e.printStackTrace();
   }
   
   request.setAttribute("boardList", boardList);
%>
<h1 class="text-center mb-5">
   게시판
</h1>
   <table class="bbslist table-hover">
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
      <tbody>
        <c:forEach var="post" items="${boardList }">
        <!-- 루프 -->
        <tr>
           <td>${post.num }</td>
           <td class="ellipsis"><a href="bbs.jsp?mode=view&num=${post.num}">${post.title }</a> </td>
           <td class="ellipsis">${post.writer }</td>
           <td>${post.viewDate }</td>
           <td>${post.count }</td>
        </tr>
        <!-- /루프 -->
        </c:forEach>
      </tbody>
   </table>

   <div class="text-right my-5 px-5">
     <a href="?mode=write" class="btn btn-success">글쓰기</a>
   </div>
