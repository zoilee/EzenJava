package chpt06.sec09.singletone;

public class LightManager {
	//���� �����ϰ� ���� private static
	private static LightManager instance;
	
	//�������� ��������
	private boolean isLightOn;
	
	//�������´� �ܺ� �ν��Ͻ����� �������� ����
	private LightManager() {
		this.isLightOn = false;
	}
	
	//getInstance()�� ����� �ν��Ͻ��� �ܺο��� ��ȯ
	public static synchronized LightManager getInstance() {
		if(instance == null) {
			instance = new LightManager();
		}
		return instance;
	}
	//������ �Ѵ� �޼���
		public void turnOnLight() {
			isLightOn = true;
			System.out.println("LightManager ����: ������ �׽��ϴ�.");
		}
		//������ ���� �޼���
		public void turnOffLight() {
			isLightOn = false;
			System.out.println("LightManager ����:������ �����ϴ�.");
		}
		//���� ���¸� Ȯ���ϴ� �޼���
		public boolean isLightOn() {
			return isLightOn;
		}
}