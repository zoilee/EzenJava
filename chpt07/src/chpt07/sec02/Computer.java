package chpt07.sec02;

public class Computer extends Calculator {
	
	@Override
	public double areaCircle(double r) {
		System.out.println("Calculator ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}
}
