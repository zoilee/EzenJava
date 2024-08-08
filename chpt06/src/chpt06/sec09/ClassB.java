package chpt06.sec09;

public class ClassB {
	public void performAction() {
		LightManager lightManager = new LightManager();
		lightManager.turnOffLight();
		
		
		String v = (lightManager.isLightOn())?"Ä×":"²°";
		System.out.println("class B¿¡¼­ Á¶¸íÀ»" +v+"½À´Ï´Ù.");
	}
}
