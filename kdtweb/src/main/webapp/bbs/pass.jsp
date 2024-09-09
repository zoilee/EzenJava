<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="kdtweb.dao.bbs.Board, kdtweb.beans.BoardDto, java.sql.*"%>
    
    
<div class="pass-box">
	<p class="text-center">비밀번호를 입력하세요.</p>
	<form action="bbspassok" class="bbspass" method="post">
		<div class="password">
			<input type="password" name="bbspassword" id="bbspassword" class="form=control" placeholder="비밀번호"/>
		</div>
		<button type="reset" class="btn btn-danger">수정</button>
		<button type="submit" class="btn btn-success">전송</button>
		<input type="hidden" />
	</form>
</div>