<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="web07.works.HelloBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		HelloBean helloBean = new HelloBean();
		out.print(helloBean.getName());
		helloBean.setName("아주컴퓨터");
	%>
	<%=helloBean.getName() %>
</body>
</html>