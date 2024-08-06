package chpt02.sec02;

public class BooleanLiteral_Exam {
	
	
	public static void main(String[] args) {
		
		int x= 10;
		boolean result1 = (x == 20);
		System.out.println(result1);
		
		boolean result2 = (x != 20);
		
		boolean result3 = (x > 20);
		
		boolean result4 = (0<x && x <20);
		
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		
		//y 변수에 30을 담은 다음에 y가 20보다 작으면 "중지합니다."출력 크면 같거나 크면 "y의 값은 30 입니다."를 출력

		int y= 30;
		boolean res1 = (y < 20);
		boolean res2 = (y > 20 && y == 30);
		
		if(y < 20) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("y의 값은" + y + "입니다");}
		}
		
	}

