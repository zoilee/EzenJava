$(function(){
	$(".focus").focus();
	
	
	$(".cbtn").click(function(e){
		const val = document.getElementById("ms").value;
		if(val === null || val === ""){
		alert("내용을 입력 해주세요");
		e.preventDefault();
		}
	});
	$(".ibtn").click(function(e){
		const name = document.getElementById("iv").value;
		if(name === null || name === ""){
		alert("이름을 입력 해주세요");
		e.preventDefault();
		}
	
	});
});