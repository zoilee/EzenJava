package chpt07.sec01.ex01;

public class PhoneExam {

	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("갤럭시", "실버");
		
		//Phone에서 상속받은 필드
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
		
		//SmartPhone 필드
		
		System.out.println("와이파이 상태 " + myPhone.wifi);
		
		//Phone에서 상속받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요 나야 거기 잘 지내니");
		myPhone.receiveVoice("연결이 되지않아 삐 소리 후 소리샘으로 연결됩니다.");
		myPhone.sendVoice("오랜만이야 내 사랑아~");
		myPhone.handUp();
		
		//SmartPhone 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();
		System.out.println("후회...하고있어요");
	}

}
