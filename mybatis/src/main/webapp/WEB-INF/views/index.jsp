
<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<ul>
	<li><a href="list">목록보기</a></li>
	<li>
		<form action="view">
			<input type="text" name="userid" id="userid" placeholder="번호조회" >
			<button type="submit">전송</button>
		</form>
	</li>
</ul>


</body>
</html>