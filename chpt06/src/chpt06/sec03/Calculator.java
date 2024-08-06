package chpt06.sec03;

public class Calculator {
	//필드 생략
	//기본 생성자
	//리턴타입 없는 메소드 선언
	void powerOn() {
		System.out.println("전원을 킵니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	//plus 호출하면 두 정수값을 받아서 더하고 
	int plus(int x, int y) {
		int result = x+y;
		return result;
	};
	//divide 호출하면 두 정수값을 받아서 나누는 메소드
	double divde(int x, int y) {
		double result = (double)x / y;
		return result;
	}
}
