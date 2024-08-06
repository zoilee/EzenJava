package chpt06.sec01;

public class Car {
	//필드
//	String company = "현대자동차";
//	String model = "캐스퍼";
//	String color = "빨강";
	int Maxspeed = 120;
	int speed;
	
	String company;
	String model;
	String color;
	
	Car(){};
	Car(String company){
		this.company = company;
	};
	Car(String company, String model){
		this.company = company;
		this.model = model;
	};
	
	
	Car(String company, String model, String color){
		this.company = company;
		this.model = model;
		this.color = color;
	};
	
	
	
//	Car(){
//		model = "현대";
//		start = true;
//		speed = 60;
//	}
		
}
