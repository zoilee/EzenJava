<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    <script src="js/script.js"></script>
</head>
<body>
    <div class="container position-relative pl-300">
        <header class="position-absolute">
            <div class="logo"><a href=""></a><img src="images/logo.png" alt=""></div>
            <div class="login">
                <input type="text" class="form-control" name="userid" id="userid" placeholder="아이디">
                <input type="password" class="form-control" name="userpass" id="userpass" placeholder="비밀번호">
                <div class="text-right"><label><input type="checkbox" name="rid" value="ok"> 아이디 저장</label></div>
                <button type="submit" class="btn btn-success btn-block">전송</button>
            </div>
            <div class="d-felx justify-content-between px-2 mb-5">
            	<a href="#">아이디/비밀번호 찾기</a>
            	<a href="register.jsp">회원가입</a>
            </div>
            <div>이미지배너</div>
        </header>