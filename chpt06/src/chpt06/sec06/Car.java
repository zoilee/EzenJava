package chpt06.sec06;

public class Car {
	//�ν��Ͻ� �ʵ�
	int speed;
	
	//�ν��Ͻ� �޼ҵ�
	void run() {
		System.out.println(speed + "���� �޸��ϴ�");
	}
	
	//�����޼ҵ�
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
