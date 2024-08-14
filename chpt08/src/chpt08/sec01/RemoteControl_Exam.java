package chpt08.sec01;

public class RemoteControl_Exam {

	public static void main(String[] args) {
		
		System.out.println("리모콘의 최대 볼륨은 " + RemoteControl.MAX_VOLUME+"입니다.");
		System.out.println("리모콘의 최대 볼륨은 " + RemoteControl.MIN_VOLUME+"입니다.");
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(20);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		rc = new Radio();
		rc.turnOn();
		rc.setMute(true);
		rc.setMute(false);
		rc.setVolume(4000);
		rc.turnOff();
		
		
	}

}
