package chpt06.sec09;

public class LightManager_Exam {

	public static void main(String[] args) {
		ClassA classA = new ClassA();
		ClassB classB = new ClassB();
		LightManager lightmanager = new LightManager();
		//ClassA �� �����ؼ� ������ Ŵ
		classA.performAction();
		
		//lightmanager ������� Ȯ��
		String v = (lightmanager.isLightOn())?"��":"��";
		System.out.println("������" +v+"���ϴ�.");
		//ClassB �� �����ؼ� ������ ��
		classB.performAction();
		
		//lightmanager ������� Ȯ��
		String v2 = (lightmanager.isLightOn())?"��":"��";
		System.out.println("������" +v2+"���ϴ�.");
		

	}

}
