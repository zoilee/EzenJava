package chpt06.sec03;

public class Calculator {
	//�ʵ� ����
	//�⺻ ������
	//����Ÿ�� ���� �޼ҵ� ����
	void powerOn() {
		System.out.println("������ ŵ�ϴ�.");
	}
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	//plus ȣ���ϸ� �� �������� �޾Ƽ� ���ϰ� 
	int plus(int x, int y) {
		int result = x+y;
		return result;
	};
	//divide ȣ���ϸ� �� �������� �޾Ƽ� ������ �޼ҵ�
	double divde(int x, int y) {
		double result = (double)x / y;
		return result;
	}
}
