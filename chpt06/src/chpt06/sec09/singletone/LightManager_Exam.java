package chpt06.sec09.singletone;

public class LightManager_Exam {

	public static void main(String[] args) {
		
		ClassA classA = new ClassA();
		ClassB classB = new ClassB();
		
		//classA���� ������ �մϴ�.
		classA.performAction();
		
		//lightManager�� ��������
		LightManager lightManager = LightManager.getInstance();
		
		//lightManager �������� Ȯ��
		String v = (lightManager.isLightOn())?"��":"��";
		System.out.println("������" +v+"���ϴ�.");
		
		classB.performAction();
		v = (lightManager.isLightOn())?"��":"��";
		System.out.println("������" +v+"���ϴ�.");
		

	}

}