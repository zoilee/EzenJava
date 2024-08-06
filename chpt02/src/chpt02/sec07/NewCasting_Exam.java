package chpt02.sec07;

public class NewCasting_Exam {

	public static void main(String[] args) {
		
		//실수 연산의 결과는 double 정수 int - 기본 타입으로 받는다.

		byte rs1 = 10 + 20; //컴파일 단계에서 미리 계산이 되어 결과를 출력
		System.out.println(rs1);
		
		byte v1 = 10;
		byte v2 = 20;
		int rs2 = v1 + v2;  //int타입으로 변환 후 연산
		System.out.println(rs2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long rs3 = v3 + v4 + v5; //가장 큰 타입인 ling으로 변환
		System.out.println(rs3);
		
		char v6 = 'A';
		char v7 = 1;
		int rs4 = v6 + v7;
		System.out.println(rs4);
		System.out.println((char)rs4);
		
		int v8 = 10;
		int rs5 = v8 / 4;  //정수 연산의 결과는 정수
		double rs6 = (double) v8 / 4; //정수연산의 결과를 실수로 받으려면 실수타입으로 변환해야 한다.
		System.out.println(rs6);
		
		char a = 'A';
		char b = 'B';
		int rs = a + b;
		System.out.println(rs);
		
		String rss = 3 + "7";
	
	}

}
