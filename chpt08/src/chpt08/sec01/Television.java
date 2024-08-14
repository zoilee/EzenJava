package chpt08.sec01;

public class Television implements RemoteControl {

	//필드
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("tv를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("tv를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		
		if(volume > RemoteControl.MAX_VOLUME) {
		this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume =volume;
		}
		System.out.println("현재 TV의 볼륨은 " + this.volume + "입니다.");
	}

}
