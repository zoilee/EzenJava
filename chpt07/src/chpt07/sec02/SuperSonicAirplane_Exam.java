package chpt07.sec02;

public class SuperSonicAirplane_Exam {

	public static void main(String[] args) {
		
		SuperSonicAirplane sa = new SuperSonicAirplane();
		sa.takeOff();
		sa.fly(); //�θ� �޼ҵ�
		sa.flyMode = SuperSonicAirplane.SUPERSONIC; 
		sa.fly(); //�ڽ� �޼ҵ�
		sa.flyMode = SuperSonicAirplane.NORMAL;
		sa.fly(); //�θ� �޼ҵ�
		sa.land();
		
		

	}

}
