package chpt02.sec07;

public class Printf_Exam {

	public static void main(String[] args) {
		/*
		 *정수 %d 
		 *%6d ____30 -- 6자리가 마련되고 왼쪽으로 빈자리가 공백이 된다.
		 *%-6ㅇ 30____ -- 오른쪽으로 빈자리가 공백이 된다.
		 *%06d -- 빈자리가 0으로 채워짐
		 *실수 %f
		 *%10.2f -- 정수가 7자리 . 소수점 이하가 2자리 (왼쪽공백)
		 *%-10.2f --- 오른쪽공백
		 *\t 탭(tab) \n 줄바꿈 %% %
		 */
		
		int var = 123;
		System.out.printf("상품의 가격: %d원\n", var);
		System.out.printf("상품의 가격: %6d원\n", var);
		System.out.printf("상품의 가격: %-6d원\n", var);
		System.out.printf("상품의 가격: %06d원\n", var);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름 %d인 원의 넓이는 %10.2f\n", 10, area);
		
		String name="홍길동";
		String job="도둑놈";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}

}
