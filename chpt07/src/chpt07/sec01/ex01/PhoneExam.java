package chpt07.sec01.ex01;

public class PhoneExam {

	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("������", "�ǹ�");
		
		//Phone���� ��ӹ��� �ʵ�
		System.out.println("�� : " + myPhone.model);
		System.out.println("���� : " + myPhone.color);
		
		//SmartPhone �ʵ�
		
		System.out.println("�������� ���� " + myPhone.wifi);
		
		//Phone���� ��ӹ��� �޼ҵ� ȣ��
		myPhone.bell();
		myPhone.sendVoice("�������� ���� �ű� �� ������");
		myPhone.receiveVoice("������ �����ʾ� �� �Ҹ� �� �Ҹ������� ����˴ϴ�.");
		myPhone.sendVoice("�������̾� �� �����~");
		myPhone.handUp();
		
		//SmartPhone �޼ҵ� ȣ��
		myPhone.setWifi(true);
		myPhone.internet();
		System.out.println("��ȸ...�ϰ��־��");
	}

}
