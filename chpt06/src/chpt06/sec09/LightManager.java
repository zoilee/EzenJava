package chpt06.sec09;

public class LightManager {
	//���� ���� �ʵ�
	private boolean isLightOn;
	
	//������ �Ѵ� �޼���
	public void turnOnLight() {
		isLightOn = true;
		System.out.println("������ �׽��ϴ�.");
	}
	//������ ���� �޼���
	public void turnOffLight() {
		isLightOn = false;
		System.out.println("������ �����ϴ�.");
	}
	//���� ���¸� Ȯ���ϴ� �޼���
	public boolean isLightOn() {
		return isLightOn;
	}
}
