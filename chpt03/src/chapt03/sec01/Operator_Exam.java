package chapt03.sec01;

public class Operator_Exam {
	public static void main(String[] args) {
		
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
		int rs1 = v1 + v2;
		System.out.println("rs1 = " + rs1);
		
		long rs2 = v1 + v2 - v4;
		System.out.println("rs2 = " + rs2);
		
		double rs3 = (double) v1 / v2;
		System.out.println("rs3 = " + rs3);
		
		int rs4 = v1 % v2;
		System.out.println("rs4 = " + rs4);
	}
}
