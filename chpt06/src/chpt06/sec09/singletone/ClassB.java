package chpt06.sec09.singletone;

public class ClassB {
	public void performAction() {
		LightManager lightManager = LightManager.getInstance();
		lightManager.turnOffLight();
		String v = (lightManager.isLightOn())?"Ä×":"²°";
		System.out.println("class B¿¡¼­ Á¶¸íÀ» " +v+" ½À´Ï´Ù.");
	}

}
