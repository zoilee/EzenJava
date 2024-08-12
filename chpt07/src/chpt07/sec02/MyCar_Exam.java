package chpt07.sec02;

public class MyCar_Exam {

	public static void main(String[] args) {
		
		Car superCar = new SuperCar();
		Car ThumpTruck = new ThumpTruck();
		Car autobycle = new AutoBycle();
		System.out.println(superCar.cracktion());
		System.out.println(ThumpTruck.cracktion());
		System.out.println(autobycle.cracktion());
	}

}
