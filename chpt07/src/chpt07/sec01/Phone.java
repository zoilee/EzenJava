package chpt07.sec01;

public class Phone {
	//�ʵ�
	public String model;
	public String color;
	
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
