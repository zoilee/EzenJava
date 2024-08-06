package chpt02.sec07;

public class Casting_Exam {

	public static void main(String[] args) {
		
		int var1 = 10;
		byte var2 = (byte) var1;
		System.out.println(var2); //강제 타입변환 해도 10이 그대로 유지됨
		
		long var3 = 300;
		int var4 = (int) var3;
		System.out.println(var4);
		
		
		int var5 = 65;
		char var6 = (char)var5;
		System.out.println(var6);
		
		double var7 = 3.15;
		int var8 = (int) var7;
		System.out.println(var8);
		
		int var9 = 103029770;
		byte var10 = (byte)var9;
		System.out.println(var10);
	}

}
