<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
*{box-sizing: border-box;}
#userform h1{
	text-align:center;
	
}
ul.userform{
	list-style-type:none;
	margin:0 auto;
	padding:0;
	width:700px;	
}
ul.userform li{
	padding:15px 0;
	border-bottom:1px dashed #ddd;
	display:flex;
}
ul.userform li>div{
	padding:8px 0;
	width:calc(100% - 45px);
}
ul.userform .label{
	display:block;
	width:150px;
	text-align:right;
	padding-right:30px;
}
ul.userform>li>input[type=text]{
	width:calc(100% - 200px);
	padding: 8px 10px;
	display:block;
	margin-bottom:10px;
}
ul.userform>li>div>input[type=text]{
	width: calc(100% - 50px);
	padding: 8px 10px;
	display:block;
	margin-bottom:10px;
}
.post{
	display:flex;
	margin-bottom:
}
.post input[type=text]{
	padding:8px 10px;	
	width: 150px;
	display:block;
}
#age{
	width:150px;
	padding:8px 10px;
}
.label2{
	margin-right: 20px;
}
.text-center{
	text-align:center;
}
button{
	padding:8px 20px;
	font-size:18px;
	margin:10px
}

</style>
</head>
<body>
<form id="userform" name="userForm" action="user.jsp" method="post" onsubmit="return validateForm()">
	<h1>User form</h1>
	<ul class="userform">
		<li>
			<label for="name" class="label">이름</label>
			<input type="text" id="name" name="name" required/>
		</li>
		<li>
			<label for="age" class="label">나이</label>
			<input type="number" id="age" name="age" required />
		</li>
		<li>
			<label class="label">주소</label>
			<div>
				<div class="post">
					<input type="text" name="postcode" id="postcode" placeholder="우편번호" readonly>
					<input type="button" onclick="execDaumPostcode()" value="우편번호 찾기">
				</div>
				<input type="text" name="address" id="address" placeholder="주소" readonly>
				<input type="text" name="detailAddress" id="detailAddress" placeholder="상세주소">
				<input type="text" name="extraAddress" id="extraAddress" placeholder="참고항목">
			</div>
		</li>
		<li>
			<label for="hobbies" class="label">취미</label>
			<label class="label2"><input type="checkbox" id="hobby1" name="hobbies" value="독서" />독서</label>
			<label class="label2"><input type="checkbox" id="hobby2" name="hobbies" value="여행" />여행</label>
			<label class="label2"><input type="checkbox" id="hobby3" name="hobbies" value="운동" />운동</label>
			<label class="label2"><input type="checkbox" id="hobby4" name="hobbies" value="음악" />음악</label>
			<label class="label2"><input type="checkbox" id="hobby5" name="hobbies" value="요리" />요리</label>
			
		</li>
	</ul>
	<div class="text-center">
		<button type="reset" class="reset">취소</button>
		<button type="submit" class="submit">전송</button>
	</div>
</form>
</body>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
    function execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                if(data.userSelectedType === 'R'){
                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있고, 공동주택일 경우 추가한다.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                    if(extraAddr !== ''){
                        extraAddr = ' (' + extraAddr + ')';
                    }
                    // 조합된 참고항목을 해당 필드에 넣는다.
                    document.getElementById("extraAddress").value = extraAddr;
                
                } else {
                    document.getElementById("extraAddress").value = '';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('postcode').value = data.zonecode;
                document.getElementById("address").value = addr;
                // 커서를 상세주소 필드로 이동한다.
                document.getElementById("detailAddress").focus();
            }
        }).open();
    }
    
    function validateForm(){
    	const form = document.forms["userForm"];
    	//이름검사 : 2자 이상, 한글만 허용 정규식
    	const name = form["name"].value;
    	const namePattern = /^[가-힣]{2,}$/;
    	if(!namePattern.test(name)){
    		alert("이름은 2자이상, 한글이어야 합니다.");
    		form['name'].focus();
    		return false;
    	}
    	//나이검사 (5 이상 숫자만)
    	const age = parsInt(form["age"].value);
    	if(age<5){
    		alert("나이는 최소 5세 이상이여야 합니다.");
    		form['age'].focus();
    		return false;
    	}
    	//주소검사
    	const postcode = form["postcode"].value;
    	const address = form["address"].value;
    	const detailAddress = form["detailAddress"].value;
    	if(postcode == ""){
    		alert("우편번호를 입력 해주세요.");
    		return false;
    	}
    	if(address == ""){
    		alert("주소를 입력 해주세요.");
    		return false;
    	}
    	if(detailAddress == ""){
    		alert("상세 주소를 입력 해주세요.");
    		return false;
    	}
    	//취미검사
    	const hobbies = form["hobbies"];
    	let hobbySelected = false;
    	for(let i = 0; i < hobbies.length; i++){
    		if(hobbies[i].checked){
    			hobbySelected = true;
    			break;
    		}
    	}
    	if(!hobbySelected){
    		alert("취미중 적어도 하나 이상을 선택 해주세요.")
    		return false;
    	}
    	return true;
    }
</script>
</html>