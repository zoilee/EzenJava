package chpt06.sec06;

public class Car {
	//인스턴스 필드
	int speed;
	
	//인스턴스 메소드
	void run() {
		System.out.println(speed + "으로 달립니다");
	}
	
	//정적메소드
	static void simulate() {
		Car myCar = new Car();
		myCar.speed =200;
		myCar.run();
	}
	
	public static void main(String[] args) {
		simulate();
		Car myCar = new Car();
		myCar.speed =90;
		myCar.run();
	}
	
	
}
