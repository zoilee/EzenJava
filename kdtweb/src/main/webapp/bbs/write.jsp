<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" href="css/summernote-bs4.css">
<script src="js/summernote-bs4.min.js"></script>
<script src="js/lang/summernote-ko-KR.js"></script>
<div class="bg-white bbs mb-4">

	<h1 class="text-center my-5">글쓰기</h1>
	<form method="post" class="row was-valited" name="write_form" id="write_form">
		<div class="col-md-6 my-3">		
			<div class="row align-items-center">
				<label for="writer" class="w-label">이름</label>
				<input type="text" class="form-control " name="writer" id="writer" required />
			</div>
		</div>
		<div class="col-md-6 my-3">		
			<div class="row align-items-center">
				<label for="password" class="w-label">비밀번호</label>
				<input type="password" class="form-control " name="password" id="password" required />
			</div>
		</div>
		<div class="col-md-12 my-3">		
			<div class="row align-items-center">
				<label for="title" class="w-label">제목</label>
				<input type="text" class="form-control " name="title" id="title" required />
			</div>
		</div>
		<div class="col-md-12 my-3">		
			<div class="row align-items-center">
				<label for="password" class="w-label">내용</label>
				<textarea class="form-control" name="contents" id="contents" required></textarea>
			</div>
		</div>
		<div class="col-md-12 text-center">
			<button class="btn btn-danger mx-2 px-4">취소</button>
			<button class="btn btn-success write mx-2 px-4">작성완료</button>
		</div>
		
	</form>
	
</div>
<script>
	$(function(){
		$('#contents').summernote({
			  height: 250
		});
		
		$('.write').click(function(e){
			e.preventDefault();
			//폼데이터 직렬화
			const formData = $('#write_form').serialize();
			//ajax 요청
			$.ajax({
				url: "bbswriteok",
				type: "post",
				data: formData,
				success: function(data){
					if(data == 1){
						alert("작성 완료");
						window.location.href="bss.jsp?bbs=list";
					}else{
						alert("작성 실패");
					}
				},
				error: function(xhr, status, error){
					alert("에러" + error);
				}
			});
			
		})
	});
</script>