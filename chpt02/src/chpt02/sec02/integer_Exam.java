package chpt02.sec02;

public class integer_Exam {

	public static void main(String[] args) {
		
		int var01 = 0b1011;  //제일 앞에 0b 또는 0B로 쓰면 2진수
		int var02 = 0206; //제일 앞에 0으로 시작하면 8진수
		int var03 = 356;
		int var04 = 0xB3; // 제일 앞이 0x로 시작하면 16진수
		
		System.out.println(var01);
		System.out.println(var02);
		System.out.println(var03);
		System.out.println(var04);
		
		
		long var05 = 10;
		long var06 = 10L;
//		long var07 = 10000000000;
		long var08 = 10000000000L;  //long 타입 인식을 위해 L을 붙인다.
		
		System.out.println(var05);
		System.out.println(var06);
//		System.out.println(var07);
		System.out.println(var08);
		
		char var09 = 'A'; //char는 문자를 작은 따음표에 넣는다.
		char var0901 = 65;
		char var10 = '가';
		char var1011 = 44032;
		
		System.out.println(var09 + "+" + var10+ "=" + (var09 + var10));
	}

}
