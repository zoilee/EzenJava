package chpt06.sec01;

public class Car_Exam {

	public static void main(String[] args) {
		
		
		//Car 클래스를 이용해 객체를 생성
		Car myCar1 = new Car();
		Car myCar2 = new Car("현대");
		Car myCar3 = new Car("현대", "제네시스");
		Car myCar = new Car("현대", "제네시스", "흰색");
		
		//Car 객체의 필드값

		System.out.println("회사명 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.Maxspeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		//car 클래스의 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 현재속도 : " + myCar.speed);
		
		System.out.println("회사명 : " + myCar1.company);
		System.out.println("모델명 : " + myCar1.model);
		System.out.println("색상 : " + myCar1.color);
		System.out.println("최고속도 : " + myCar1.Maxspeed);
		System.out.println("현재속도 : " + myCar1.speed);
		System.out.println("회사명 : " + myCar2.company);
		System.out.println("모델명 : " + myCar2.model);
		System.out.println("색상 : " + myCar2.color);
		System.out.println("최고속도 : " + myCar2.Maxspeed);
		System.out.println("현재속도 : " + myCar2.speed);
		System.out.println("회사명 : " + myCar3.company);
		System.out.println("모델명 : " + myCar3.model);
		System.out.println("색상 : " + myCar3.color);
		System.out.println("최고속도 : " + myCar3.Maxspeed);
		System.out.println("현재속도 : " + myCar3.speed);
		
	}

}
