package chpt06.sec03;

public class Calculator_Exam {

	public static void main(String[] args) {
		
		//��ü�� ������
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		
		int rs = myCalc.plus(5, 10);
		System.out.println("�� �� 5 �� 8�� ���� " + rs + "�Դϴ�.");
		
		int x = 11;
		int y = 4;
		double rs2 = myCalc.divde(x, y);
		System.out.println("�� �� x�� y�� ���� ���� "+ rs2 + "�Դϴ�.");
		
		myCalc.powerOff();
		
		

	}

}
