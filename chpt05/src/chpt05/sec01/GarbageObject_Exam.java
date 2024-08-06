package chpt05.sec01;

public class GarbageObject_Exam {

	public static void main(String[] args) {
		
		String hobby = "여행";
		hobby = null;  //"여행"에 해당하는 String 객체를 쓰레기로 만듦
		
		String kind1= "자동차";
		String kind2= kind1;
		kind1 = null; //"자동차"객체는 쓰레기가 아님 kind2가 갖고 있음
		System.out.println(kind2);

	}

}
