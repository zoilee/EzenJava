package chpt02.sec02;

public class integer_Exam {

	public static void main(String[] args) {
		
		int var01 = 0b1011;  //���� �տ� 0b �Ǵ� 0B�� ���� 2����
		int var02 = 0206; //���� �տ� 0���� �����ϸ� 8����
		int var03 = 356;
		int var04 = 0xB3; // ���� ���� 0x�� �����ϸ� 16����
		
		System.out.println(var01);
		System.out.println(var02);
		System.out.println(var03);
		System.out.println(var04);
		
		
		long var05 = 10;
		long var06 = 10L;
//		long var07 = 10000000000;
		long var08 = 10000000000L;  //long Ÿ�� �ν��� ���� L�� ���δ�.
		
		System.out.println(var05);
		System.out.println(var06);
//		System.out.println(var07);
		System.out.println(var08);
		
		char var09 = 'A'; //char�� ���ڸ� ���� ����ǥ�� �ִ´�.
		char var0901 = 65;
		char var10 = '��';
		char var1011 = 44032;
		
		System.out.println(var09 + "+" + var10+ "=" + (var09 + var10));
	}

}
