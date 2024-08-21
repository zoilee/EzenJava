package chpt13.sec01;

public class GenericR_Exam {

	public static void main(String[] args) {
		
		HomeAgency homeAgency = new HomeAgency();
		House house = homeAgency.rent();
		house.turnOnDoor();
		
		
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();
	}

}
