<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<h1>edit</h1>
	<form name="form" action="edit" method="post" onsubmit="return validateForm();">
		<ul>
			<li>
				<label for="">제목</label>
				<input type="text" name="title" value="${board.title}" />
			<li>
				<label for="">내용</label>
				<input type="text" name="content" value="${board.content }" />
			</li>
			<li>
				<label for="">작성자</label>
				<input type="text" name="writer" value="${board.writer }" />
			</li>
		</ul>
		<input type="hidden" name="id" value="${board.id}" />
		<button type="submit">전송</button>
	</form>
</body>
</html>
<script>
    function validateForm() {
        const title = document.forms["form"]["title"].value;
        const content = document.forms["form"]["content"].value;
        const writer = document.forms["form"]["writer"].value;

        if (title.trim() === "") {
            alert("제목을 입력해주세요.");
            return false;
        }
        if (content.trim() === "") {
            alert("내용을 입력해주세요.");
            return false;
        }
        if (writer.trim() === "") {
            alert("작성자를 입력해주세요.");
            return false;
        }
        return true; // 모든 입력이 유효한 경우
    }
</script>