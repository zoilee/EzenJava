package chpt05.sec01;

public class Equals_Exam {

	public static void main(String[] args) {

		String str1 = "홍길동";
		String str2 = "홍길동";
		
		if(str1 == str2) {
			System.out.println("str1과 str2는 같습니다");
		}else {
			System.out.println("str1과 str2는 다릅니다.");
		}
		
		String str3 = new String("홍길동");
		if(str3 == str1) {
			System.out.println("str1과 str3는 같습니다.");
		}else {
			System.out.println("str1과 str3는 다릅니다.");
		}
		
		//문자열의 같고 다름을 조사할 때는 java에서는 equals()를 이용한다.
		if(str3.equals(str1)) {
			System.out.println("str1과 str3는 같습니다.");
		}else {
			System.out.println("str1과 str3는 다릅니다.");
		}
	}

}
