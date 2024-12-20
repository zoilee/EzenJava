package chpt06.sec09.singletone;

public class LightManager_Exam {

	public static void main(String[] args) {
		
		ClassA classA = new ClassA();
		ClassB classB = new ClassB();
		
		//classA에서 조명을 켭니다.
		classA.performAction();
		
		//lightManager의 조명상태
		LightManager lightManager = LightManager.getInstance();
		
		//lightManager 조명상태 확인
		String v = (lightManager.isLightOn())?"켰":"껐";
		System.out.println("조명을" +v+"습니다.");
		
		classB.performAction();
		v = (lightManager.isLightOn())?"켰":"껐";
		System.out.println("조명을" +v+"습니다.");
		

	}

}
