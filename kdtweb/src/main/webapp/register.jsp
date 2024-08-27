<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp" %>
<div class="row">
	<div class="col-12">
		<div class="bg-white">
			<h1 class="text-center py-5">회원가입</h1>
			<p class="text-center mb-5">*표가 있는 곳은 필수 입력항목 입니다.</p>
			<form name="registerform" id="registerform" action="register" methid="post">
				<ul class="registerul"></ul>
					<li class="d-flex py-4 border-bottom">
						<label for="" name ="userid" class="col-2 text-right">아이디</label>
						<div class="col-10">
							<input type="text" name ="userid" class="form-control" placeholder="*"/>
						</div>
					</li>
					<li class="d-flex py-4 border-bottom">
						<label for="" name ="userpass" class="col-2 text-right">비밀번호</label>
						<div class="col-10">
							<input type="text" name ="userpass" class="form-control" placeholder="*"/>
						</div>
					</li>
					<li class="d-flex py-4 border-bottom">
						<label for="" name ="username" class="col-2 text-right">이름</label>
						<div class="col-10">
							<input type="text" name ="username" class="form-control" placeholder="*"/>
						</div>
					</li>
					<li class="d-flex py-4 border-bottom">
						<label for="" name ="useremail" class="col-2 text-right">이메일</label>
						<div class="col-10">
							<input type="text" name ="useremail" class="form-control" placeholder="*"/>
						</div>
					</li>
					<input type="submit" class="btn btn-primary mx-auto" />
				</ul>
			</form>
		</div>
	</div>
</div>
<%@ include file="include/footer.jsp" %>