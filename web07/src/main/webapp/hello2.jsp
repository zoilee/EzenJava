<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="helloBean" class="web07.works.HelloBean" scope="page"/>
<jsp:setProperty name="helloBean" property="name" value="우정컴푸터"/>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:getProperty property="name" name="helloBean"/>
</body>
</html>