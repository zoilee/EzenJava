package chpt02.sec07;

public class Vscope_Exam {

	public static void main(String[] args) {

		int var1 = 100;
		int var2, var3=0 ,  var4 = 0;
		if(true) {
			var2 = 300;
			
		}
		for(int i= 0; i <10; i++) {
			if(i == 0) {
				var3 = 400;
				;
			} else {
				var4 = 500;
				;
			}						
		}
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		//System 시스템으로 out 출력 print //ln줄바꿈
		//print() println() prinf("형식문자열", 값1, 값2 ....);
		//문자열 타입 %s, 숫자열 타입 %d(정수), %f(실수)
		String name = "홍길동";
		int age = 30;
		
		System.out.printf("이름 : %s , 나이: %d", name, age);

	}
}
