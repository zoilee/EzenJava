<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String sessionUserid = (String) session.getAttribute("userid");
%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>관리자모드</title>
    <link rel="stylesheet" href="css/remixicon.css">
    <link rel="stylesheet" href="css/fonts.css">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
    <script src="js/jquery.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/pycs-layout.jquery.js"></script>
    <script src="js/jquery.validate.min.js"></script>
    <script src="js/script.js"></script>
</head>
<body>
    <div class="container position-relative pl-300">
        <header class="position-absolute ">
            <div class="logo"><a href=""></a><img src="images/logo.png" alt=""></div>
            <%
            	if(sessionUserid == null){
            %>
            
            
            <form id="loginform" class="login" method="post" action="loginok">
                <input type="text" class="form-control" name="userid" id="userid" placeholder="아이디">
                <input type="password" class="form-control" name="userpass" id="userpass" placeholder="비밀번호">
                <div class="text-right"><label><input type="checkbox" name="rid" id="rid" value="ok"> 아이디 저장</label></div>
                <button type="submit" class="btn btn-success btn-block">로 그 인</button>
            </form>
            <div class="d-felx justify-content-between px-2 mb-5">
            	<a href="findidpass.jsp">아이디/비밀번호 찾기</a>
            	<a href="register.jsp">회원가입</a>
            </div>
            <%
            	}else{
            %>
            <div id="loginform" class="login">
            	<h5 class="text-center">
            		<%=sessionUserid %>님 로그인
            	</h5>
            	<p class="text-center">
            		<a href="editmem.jsp">회원정보수정</a>
            		<a href="logout.jsp">로그아웃</a>
            	</p>
            </div>
            <% } %>
            <div>이미지배너</div>
        </header>