package chapt03.sec02;

public class CompareOper_Exam {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 10;
		boolean rs1 = (num1 == num2); 
		boolean rs2 = (num1 != num2); 
		boolean rs3 = (num1 <= num2); 
		
		System.out.println("rs1 : " + rs1); //true
		System.out.println("rs2 : " + rs2); //false
		System.out.println("rs3 : " + rs3); //true
		
		char char1 = 'A';
		char char2 = 'B';
		boolean rs4 = (char1<char2);
		System.out.println("rs4 : " + rs4); //true
		
		
		int num3 = 1;
		double num4 = 1.0;
		boolean rs5 = (num3 == num4);
		System.out.println("rs5 : " + rs5);
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean rs6 = (num5 == num6);
		boolean rs7 = (num5 == (float)num6);
		
		System.out.println("rs6 : " + rs6);
		System.out.println("rs7 : " + rs7);
		
		char num7 = 'A';
		int num8 = 65;
		boolean rs8 = (num7 == num8);
		
		System.out.println("rs8 : " + rs8);
		
		String str1 = "자바";
		String str2 = "자바";
		
		boolean rs9 = (str1 == str2);
		System.out.println("rs9 : " + rs9);
		
		String str3 = new String("java");
		String str4 = new String("java");
		
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);
		
		boolean rs10 = (str3 == str4);
		System.out.println("rs10 : " + rs10);
		
		boolean rs11 = str3.equals(str4);  //string 타입의 비교는 무조건 equals()메소드 이용
		System.out.println("rs11 : " + rs11);
	}

}
