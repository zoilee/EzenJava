package chpt05.sec01;

public class NullPointerException_Exam {

	public static void main(String[] args) {
		
		int[] intArr = null;
		//intArr[0] = 10;
		
		String str = null;
		System.out.println("str문장의 길이는" + str.length()+"입니다.");
		
		String hobby = "여행";
		hobby = null;
	}

}
