<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	//폼 데이터 받기
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String post = request.getParameter("post");
	String address = request.getParameter("address");
	String detailAddress = request.getParameter("detailAddress");
	String extraAddress = request.getParameter("extraAddress");
	String[] hobbies = request.getParameterValues("hobbies");
	int nAge = 0;
	if(age != null && !age.trim().isEmpty()){
		try{
			nAge = Integer.parseInt(age) -1;
		}catch(NumberFormatException e){
			nAge = 0;
		}
	}
	String postalCode = address + detailAddress + extraAddress;
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>이름 : <%=name%></p>
	<p>나이 : <%=nAge%></p>
	<p>주소 : <%=postalCode%></p>
	<p>취미 : <%
				String hobby = (hobbies !=null)? String.join(", ",hobbies) : "취미가 없습니다.";
				/*
				if(hobbies !=null){
					for(String hobby : hobbies){
						out.print(hobby + " ");
					}
				}else{
					out.print("취미가 없어요.");
				}
				*/
			%>
			<%= hobby %>
			</p>
</body>
</html>