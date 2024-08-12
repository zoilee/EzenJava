package chpt07.sec01;

public class SmartPhone extends Phone{
	//필드선언
	public boolean wifi;
	
	//생성자선언
	public SmartPhone(String model, String color) {
		
		//super(); == 컴파일시 자동으로 추가 매게값을 넣고싶으면 직접 입력해줘야됨.
		//부모인 phone으로 부터 상속받은 필드를 초기화
		this.model = model;
		this.color = color;
	}

	
	//메소드 선언
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}

	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}
