package chpt02.sec07;

public class NewCasting2_Exam {

	public static void main(String[] args) {
		
		int rs1 = 10 + 2 + 8;
		System.out.println(rs1);
		
		String rs2 = 10 + 2 + "8";
		System.out.println(rs2);
		
		String rs3 = 10 + "2" + 8;
		System.out.println(rs3);
		
		String rs4 = "10" + 2 + 8;
		System.out.println(rs4);
		
		String rs5 = "10" + (2 + 8);
		System.out.println(rs5);

	}

}
