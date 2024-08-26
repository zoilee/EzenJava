<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //한글 request 처리
    request.setCharacterEncoding("utf-8");
    String name = request.getParameter("name");
    String addr = request.getParameter("addr");
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>이름 : <%=name %></p>
<p>주소 : <%=addr %></p>
</body>
</html>