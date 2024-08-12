package chpt07.sec01.ex01;

public class Phone {
	//필드
	public String model;
	public String color;
	
	//매개변수를 갖는 생성자 선언
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("부모생성자가 자기 필드 초기화를 직접 담당");
	}
	
	//메소드
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	public void sendVoice(String message) {
		System.out.println("나 : " + message);
	}
	public void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}
	public void handUp() {
		System.out.println("전화를 끊습니다.");
	}
}
