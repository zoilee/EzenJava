package chpt02.sec07;

public class Promotion_Exam {

	public static void main(String[] args) {
		
		//자동타입변환
		byte byteVar = 10;
		int intVar = byteVar;
		System.out.println(intVar);
		
		char charVar = '가';
		intVar = charVar;
		System.out.println(intVar);
		
		intVar = 4000;
		long longVar = intVar;
		System.out.println(longVar);
		
		float floatVar = longVar;
		System.out.println(floatVar);
		
		floatVar = 100.4f;
		double doubleVar = floatVar;
		System.out.println(doubleVar);
	}

}
