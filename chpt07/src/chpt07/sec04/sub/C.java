package chpt07.sec04.sub;

import chpt07.sec04.A;

public class C extends A {
	
	//������
	public C() {
		super(); //A()������ ȣ��
	}
	
	public void method1() {
		this.field = "value";
		this.method();
		
	}
}
