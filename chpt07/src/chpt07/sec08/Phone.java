package chpt07.sec08;

public abstract class Phone {

	//�ʵ弱��
	String owner;
	
	//������ 
	Phone(String owner){
		this.owner = owner;
	}
	
	//�޼ҵ�
	void turnOn(){
		System.out.println("�� ������ �ѿ�.");
	}
	void turnOff() {
		System.out.println("�� ������ ����.");
	}
}
