package chpt05.sec01;

public class NullPointerException_Exam {

	public static void main(String[] args) {
		
		int[] intArr = null;
		//intArr[0] = 10;
		
		String str = null;
		System.out.println("str������ ���̴�" + str.length()+"�Դϴ�.");
		
		String hobby = "����";
		hobby = null;
	}

}
