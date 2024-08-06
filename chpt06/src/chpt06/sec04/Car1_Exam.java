package chpt06.sec04;

public class Car1_Exam {

	public static void main(String[] args) {
		//객체생성
		Car1 myCar = new Car1();
		
		myCar.setGas(10);
		if(myCar.viewgas()) {
			System.out.println("출발해영.");
			
			//run()메소드 호출
			myCar.run();
		}
		System.out.println("gas를 주유해 주세여.");
	}

}
