package chpt05.sec02;

public class SearchStr_Exam {

	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		
		int java = str.indexOf("자바");
		if(java == -1) {
			System.out.println("자바와 관련 없는 책입니다.");
		}else{
			System.out.println("자바와 관련된 도서 입니다.");
		}
		
		
		Boolean pro = str.contains("프로그래밍");
		if(pro == true) {
			System.out.println("프로그래밍 관련 도서입니다.");
		}else{
			System.out.println("프로그래밍과 관련이 없는 도서입니다.");
		}
		
	
	}

}
