package chpt07.sec08;

public abstract class Phone {

	//필드선언
	String owner;
	
	//생성자 
	Phone(String owner){
		this.owner = owner;
	}
	
	//메소드
	void turnOn(){
		System.out.println("폰 전원을 켜용.");
	}
	void turnOff() {
		System.out.println("폰 전원을 꺼용.");
	}
}
