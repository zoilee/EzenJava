package chpt06.sec02;

public class Car_Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("자가용");
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		
		Car car2 = new Car("자가용", "블루");
			System.out.println("car2.company : " + car2.company);
			System.out.println("car2.model : " + car2.model);
			System.out.println("car2.color : " + car2.color);
			
		Car car3 = new Car("택시", "검정", 200);
			System.out.println("car3.company : " + car3.company);
			System.out.println("car3.model : " + car3.model);
			System.out.println("car3.color : " + car3.color);
			System.out.println("car3.maxSpeed : " +car3.maxSpeed);

	}

}
