package chpt11.sec01;

public class Exception2Handling_Exam {

	
	
	
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String2 Ŭ������ �����մϴ�.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
