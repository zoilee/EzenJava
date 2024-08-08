package chpt06.sec09;

public class LightManager {
	//조명 상태 필드
	private boolean isLightOn;
	
	//조명을 켜는 메서드
	public void turnOnLight() {
		isLightOn = true;
		System.out.println("조명을 켰습니다.");
	}
	//조명을 끄는 메서드
	public void turnOffLight() {
		isLightOn = false;
		System.out.println("조명을 껐습니다.");
	}
	//조명 상태를 확인하는 메서드
	public boolean isLightOn() {
		return isLightOn;
	}
}
