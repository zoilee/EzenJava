package chpt06.sec09;

public class ClassA {
	public void performAction() {
		LightManager lightManager = new LightManager();
		lightManager.turnOnLight();
		String v = (lightManager.isLightOn())?"Ä×":"²°";
		System.out.println("class A¿¡¼­ Á¶¸íÀ»" +v+"½À´Ï´Ù.");
	}
}
