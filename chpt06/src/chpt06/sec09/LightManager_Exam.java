package chpt06.sec09;

public class LightManager_Exam {

	public static void main(String[] args) {
		ClassA classA = new ClassA();
		ClassB classB = new ClassB();
		LightManager lightmanager = new LightManager();
		//ClassA 를 실행해서 조명을 킴
		classA.performAction();
		
		//lightmanager 조명상태 확인
		String v = (lightmanager.isLightOn())?"켰":"껐";
		System.out.println("조명을" +v+"습니다.");
		//ClassB 를 실행해서 조명을 끔
		classB.performAction();
		
		//lightmanager 조명상태 확인
		String v2 = (lightmanager.isLightOn())?"켰":"껐";
		System.out.println("조명을" +v2+"습니다.");
		

	}

}
