package chpt07.sec02;

public class SuperSonicAirplane_Exam {

	public static void main(String[] args) {
		
		SuperSonicAirplane sa = new SuperSonicAirplane();
		sa.takeOff();
		sa.fly(); //부모 메소드
		sa.flyMode = SuperSonicAirplane.SUPERSONIC; 
		sa.fly(); //자식 메소드
		sa.flyMode = SuperSonicAirplane.NORMAL;
		sa.fly(); //부모 메소드
		sa.land();
		
		

	}

}
