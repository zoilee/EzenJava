package chpt07.sec01;

public class SmartPhone extends Phone{
	//�ʵ弱��
	public boolean wifi;
	
	//�����ڼ���
	public SmartPhone(String model, String color) {
		
		//super(); == �����Ͻ� �ڵ����� �߰� �Ű԰��� �ְ������ ���� �Է�����ߵ�.
		//�θ��� phone���� ���� ��ӹ��� �ʵ带 �ʱ�ȭ
		this.model = model;
		this.color = color;
	}

	
	//�޼ҵ� ����
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("�������� ���¸� �����߽��ϴ�.");
	}

	public void internet() {
		System.out.println("���ͳݿ� �����մϴ�.");
	}
}
