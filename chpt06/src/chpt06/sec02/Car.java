package chpt06.sec02;

public class Car {
	//�ʵ弱��
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������
	Car(String model){
		this(model, "����", 250);
	};
	Car(String model, String color){
		this(model, color, 250);
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
