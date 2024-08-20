package chpt11.sec01;

public class Exception2Handling_Exam {

	
	
	
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String2 클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
