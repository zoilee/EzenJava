$(function(){
      $("#rid").change(function(){
        if($(this).is(":checked")){
            alert("PC방, 관공서등에서 사용하지 마세요.");
        }
      });

	const userIdFromCookie = getCookie('userid');
	if(userIdFromCookie){
		$("#userid").val(userIdFromCookie);
	}
	
	
    $('#loginform').validate({
        debug: false, 
        rules: {
            userid: "required",
            userpass: "required"
        },
        messages: {
            userid: "아이디를 입력하세요.",
            userpass: "비밀번호를 입력하세요."
        },
        showErrors: function(errorMap, errorList){
          if(errorList.length){
            if(!this.alreadyAlerted) {
               alert(errorList[0].message); 
               this.alreadyAlerted = true; 
            }
          }else{
            this.alreadyAlerted = false;
          }
        }
        
    });
});


function setCookie(name, value, exp){
	const date = new Date();
	date.setTime(date.getTime() + exp * 24 * 60 * 60 * 1000);
	document.cookie = name + '=' + value + ';expires='+date,toUTCString() + ";path=/";
}

function getCookie(name){
	const value = document.cookie.match('(^|;)?' + name + '=([^;]*)(;|$)');
	// (^|;) 쿠키 이름 앞에 시작부분(^)이거나 세미콜론 ; 이 올 수 있음 (쿠키가 여려개일 경우 ;로 구분됨)
	//? 쿠키이름 세미콜론 사이에 공백이 있을 수 있다.(있을수도 없을수도)
	//[^;]* 세미콜론이 나오기 전까지 모든 문자를 캡처한다. 세미콜론이 아닌 0개 이상의 문자
	//끝나는 지점앞에 ;이 온다. 아니면 끝이 아니다.
	return value? value[2]:null;
}

function delCookie(name){
	document.cookie = name + '=; expires=Thu, 01 Jan 1999 00:00:10 GMT;';
}