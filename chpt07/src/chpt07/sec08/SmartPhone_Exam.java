package chpt07.sec08;

public class SmartPhone_Exam {

	public static void main(String[] args) {
		
		//Phone phone = new Phone("르브론");
		SmartPhone smartPhone = new SmartPhone("르브론");
		
		smartPhone.turnOn(); // Phone 메소드
		smartPhone.internetSearch(); // 자기자신 메소드
		smartPhone.turnOff(); //Phone 메소드
	}

}
