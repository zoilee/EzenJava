package chpt07.sec08;

public abstract class Animal {
	//추상 메소드
	public abstract void sound();

	//일반 메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
}
