<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="kdtweb.dao.bbs.Board, kdtweb.beans.BoardDto, java.sql.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%
	int num = 0;
	int result = 0;
	String mode = request.getParameter("mode");
	
	if(request.getParameter("num") != null){
		num = Integer.parseInt(request.getParameter("num"));
	}
	String userid = (String) request.getSession().getAttribute("userid");
	Board bbs = new Board();
	try{
		result = bbs.selectUserId(userid, num);
		
	}catch(SQLException e){
		e.printStackTrace();
	}
	request.setAttribute("num",num);
	request.setAttribute("result",result);
%>

<c:choose>
	<c:when test="${num == 0  }">
		<script>
			alert("오류가 발생했습니다.");
			history.back();
		</script>
	</c:when>
	<c:when test="${sessionScope.userid==null || result == 0 }">
		<div class="pass-box">
			<p class="text-center">비밀번호를 입력하세요.</p>
			<form action="bbspassok" class="bbspass" method="post">
				<div class="password">
					<input type="password" name="bbspassword" id="bbspassword" class="form-control" placeholder="비밀번호"/>
				</div>
				<button type="reset" class="btn btn-danger">수정</button>
				<button type="submit" class="btn btn-success">전송</button>
				<input type="hidden" />
			</form>
		</div>
	</c:when>
	<c:when test="${result == 1 }">
		<jsp:include page="${mode }" />
	</c:when>
</c:choose>