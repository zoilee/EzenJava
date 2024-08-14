package chpt08.sec01;

public interface RemoteControl {
	//상수 필드 선언
	int MAX_VOLUME = 100; //public static final 이 된다.
	int MIN_VOLUME = 0;
	//추상 메소드
	public void turnOn();
	public void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute){
			System.out.println("무음입니다.");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
}