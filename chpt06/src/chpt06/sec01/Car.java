package chpt06.sec01;

public class Car {
	//�ʵ�
//	String company = "�����ڵ���";
//	String model = "ĳ����";
//	String color = "����";
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
//		model = "����";
//		start = true;
//		speed = 60;
//	}
		
}
