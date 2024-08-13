package chpt07.sec07;

public class Child extends Parent{
	
	public String field2;
	@Override
	public void method2() {
		System.out.println("자식메소드2()");
	}
	public void method3() {
		System.out.println("자식메소드3()");
	}
}
