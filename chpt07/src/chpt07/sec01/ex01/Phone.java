package chpt07.sec01.ex01;

public class Phone {
	//�ʵ�
	public String model;
	public String color;
	
	//�Ű������� ���� ������ ����
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("�θ�����ڰ� �ڱ� �ʵ� �ʱ�ȭ�� ���� ���");
	}
	
	//�޼ҵ�
	public void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	public void sendVoice(String message) {
		System.out.println("�� : " + message);
	}
	public void receiveVoice(String message) {
		System.out.println("���� : " + message);
	}
	public void handUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}
