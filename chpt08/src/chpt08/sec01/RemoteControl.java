package chpt08.sec01;

public interface RemoteControl {
	//��� �ʵ� ����
	int MAX_VOLUME = 100; //public static final �� �ȴ�.
	int MIN_VOLUME = 0;
	//�߻� �޼ҵ�
	public void turnOn();
	public void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute){
			System.out.println("�����Դϴ�.");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
}