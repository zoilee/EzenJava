package chpt06.sec09;

public class ClassA {
	public void performAction() {
		LightManager lightManager = new LightManager();
		lightManager.turnOnLight();
		String v = (lightManager.isLightOn())?"��":"��";
		System.out.println("class A���� ������" +v+"���ϴ�.");
	}
}
