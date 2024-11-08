<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>shop</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<style>
.cart{
	position:absolute;
	z-index:100;
	top:0;
	right:50px;
	width:260px;
	padding:40px;
	border:1px solid #333;
}
</style>
<script src="https://code.jquery.com/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<h1>MY SHOP</h1>
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<form class="card">
					<img src="image/01.jpg" alt="상품1" class="card-img-top" />
					<div class="card-body">
						<h4 class="card-title">상품1</h4>
						<p class="card-text">50,000</p>
						<div class="text-center">
							<button type="button" class="btn btn-primary" onClick="addToCart('상품1', 50000)">카트에넣기</button>
						</div>
					</div>
				</form>
			</div>
			<div class="col-md-3">
				<form class="card">
					<img src="image/02.jpg" alt="상품2" class="card-img-top"/>
					<div class="card-body">
						<h4 class="card-title">상품2</h4>
						<p class="card-text">30,000</p>
						<div class="text-center">
							<button type="button" class="btn btn-primary" onClick="addToCart('상품2', 30000)"  >카트에넣기</button>
						</div>
					</div>
				</form>
			</div>
			<div class="col-md-3">
				<form class="card">
					<img src="image/03.jpg" alt="상품3" class="card-img-top"/>
					<div class="card-body">
						<h4 class="card-title">상품3</h4>
						<p class="card-text">500,000</p>
						<div class="text-center">
							<button type="button" class="btn btn-primary" onClick="addToCart('상품3', 500000)" >카트에넣기</button>
						</div>
					</div>
				</form>
			</div>
			<div class="col-md-3">
				<form class="card">
					<img src="image/04.jpg" alt="상품4" class="card-img-top" />
					<div class="card-body">
						<h4 class="card-title">상품4</h4>
						<p class="card-text">240,000</p>
						<div class="text-center">
							<button type="button" class="btn btn-primary" onClick="addToCart('상품4', 240000)">카트에넣기</button>
						</div>
					</div>
				</form>
			</div>
			<div class="col-md-3">
				<form class="card">
					<img src="image/05.jpg" alt="상품5" class="card-img-top" />
					<div class="card-body">
						<h4 class="card-title">상품5</h4>
						<p class="card-text">2,000</p>
						<div class="text-center">
							<button type="button" class="btn btn-primary" onClick="addToCart('상품5', 2000)">카트에넣기</button>
						</div>
					</div>
				</form>
			</div>
			<div class="col-md-3">
				<form class="card">
					<img src="image/06.jpg" alt="상품6" class="card-img-top" />
					<div class="card-body">
						<h4 class="card-title">상품6</h4>
						<p class="card-text">60,000</p>
						<div class="text-center">
							<button type="button" class="btn btn-primary" onClick="addToCart('상품6', 60000)">카트에넣기</button>
						</div>
					</div>
				</form>
			</div>
			<div class="col-md-3">
				<form class="card">
					<img src="image/07.png" alt="상품7" class="card-img-top" />
					<div class="card-body">
						<h4 class="card-title">상품7</h4>
						<p class="card-text">8,000</p>
						<div class="text-center">
							<button type="button" class="btn btn-primary" onClick="addToCart('상품7', 8000)">카트에넣기</button>
						</div>
					</div>
				</form>
			</div>
			<div class="col-md-3">
				<form class="card">
					<img src="image/08.jpg" alt="상품8" class="card-img-top" />
					<div class="card-body">
						<h4 class="card-title">상품8</h4>
						<p class="card-text">100,000</p>
						<div class="text-center">
							<button type="button" class="btn btn-primary" onClick="addToCart('상품8', 100000)">카트에넣기</button>
						</div>
					</div>
				</form>
			</div>
		</div>
		<div class="cart text-center">
			<form class="cart-in"></form>
			
			
		</div>
	</div>
	<form action="order" mothod="post" id="orderform">
	
	</form>
	<script>
	//전역으로 cart 변수 만듬 (여기에 담을 거임), 여러개 이니 배열
	let cart = [];
	
	function addToCart(pdname, pdprice){
		let cartObj = {
			"pdname" : pdname,
			"pdprice" : pdprice
		}
		//배열 cart 에 push
		cart.push(cartObj);
		console.log(cart);
		updateCart();	
	}
	
	function updateCart(){
		let totalPrice = 0;
		let cartContent = '<ul class="list-group">';
		cart.forEach(function(item, index){
		      
		      if(item.pdname && typeof item.pdprice === 'number') {
		    	totalPrice += item.pdprice;
		      cartContent += "<li class='list-group-item d-flex justify-content-between'>" +
		                     "<div>"+
		                     "<label>이름</label>"+
		                     item.pdname +
		           "</div>"+
		           "<div>"+
		             "<label>가격</label>"+
		              item.pdprice.toLocaleString() +" 원"+ 
		           "</div>"+
		         "</li>" + 
		         "<input type='hidden' name='pdname[]' value='"+item.pdname+"'/>"+
		         "<input type='hidden' name='pdprice[]' value='"+item.pdprice+"'/>"
		         ;	

		      }else{
		         console.error('무언가 에러' , item);
		      }   
		   });   
		   
		   cartContent += '<p>총 가격 :'+totalPrice.toLocaleString()+'원</p>';
		   cartContent += '</ul>';
		   cartContent +='<button id="orderbtn" type="button" class="btm btn-success mt-3">주문하기</button>';

		   console.log(cartContent);
		   $('.cart-in').html(cartContent);
		}

	
	$(function(){
		$(window).scroll(function(){
			let scrollTop = $(window).scrollTop();
			
			$(".cart").css("top",scrollTop+ "px");
		});
		
		$(document).on('click', "#orderbtn", function(){
			let productName = [];
			let productPrice = [];
			$('input[name="pdname[]"]').each(function(){
				productName.push($(this).val());
			});
			$('input[name="pdprice[]"]').each(function(){
				productPrice.push($(this).val());
			});
			
			//가격의 합
			totalPrice = productPrice.reduce((acc, currentVal) => acc + Number(currentVal), 0);
			
			//ajax
			$.ajax({
				url: 'orderbox',
				type: 'post',
				data:{
					'pdname[]' : productName,
					'pdprice[]': productPrice,
					'totalPrice' : totalPrice
				},
				success: function(data){
					//서버로 부터 pdf 파일 받아서 다운로드 처리하기
					
					//Binary Large Object -- 이미지, 사운드, 비디오 등등 멀티미디어 데이터를 다룰 때 사용
					/*
					let blob = new Blob([data], {type: 'application/pdf'});
					let link = document.createElement('a');
					link.href = window.URL.createObjectURL(blob);
					link.download = 'order.pdf';
					link.click();
					*/
					if(data.filePath){
						window.location.href = data.filePath; //pdffile download
					}else{
						alert("pdf파일이 생성되지 않았습니다");
					}
				},error: function(error){
					console.error('에러'+error);
				}
			});
		});
	});
	</script>
</body>
</html>