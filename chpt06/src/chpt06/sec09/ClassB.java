package chpt06.sec09;

public class ClassB {
	public void performAction() {
		LightManager lightManager = new LightManager();
		lightManager.turnOffLight();
		
		
		String v = (lightManager.isLightOn())?"��":"��";
		System.out.println("class B���� ������" +v+"���ϴ�.");
	}
}
