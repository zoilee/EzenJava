package chpt07.sec02;

public class SuperSonicAirplane extends Airplane{
	//���
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	
	//���� �ʵ�
	
	public int flyMode = NORMAL;
	
	//�޼ҵ� ������
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("������ �����մϴ�.");
		}else { //�θ� ��ü�� fly �޼ҵ带 ȣ��
			super.fly();
		}
	}
	
	
	

}
