package chpt06.sec09.singletone;

public class LightManager {
	//변수 유일하게 선언 private static
	private static LightManager instance;
	
	//조명상태 조정변수
	private boolean isLightOn;
	
	//조명상태는 외부 인스턴스에서 생성하지 못함
	private LightManager() {
		this.isLightOn = false;
	}
	
	//getInstance()를 만들어 인스턴스를 외부에서 반환
	public static synchronized LightManager getInstance() {
		if(instance == null) {
			instance = new LightManager();
		}
		return instance;
	}
	//조명을 켜는 메서드
		public void turnOnLight() {
			isLightOn = true;
			System.out.println("LightManager 상태: 조명을 켰습니다.");
		}
		//조명을 끄는 메서드
		public void turnOffLight() {
			isLightOn = false;
			System.out.println("LightManager 상태:조명을 껐습니다.");
		}
		//조명 상태를 확인하는 메서드
		public boolean isLightOn() {
			return isLightOn;
		}
}
