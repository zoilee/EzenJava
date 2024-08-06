package chpt02.sec07;

import java.util.Scanner;

public class Scanner_Exam {
	public static void main(String[] arg) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("값을 입력하세요. >>");
//		String str = sc.nextLine();
//		
//		System.out.println(str);
		//키보드로 숫자 두 개를 입력 받아 덧셈 결과를 출력하세요!!
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("x 값을 입력하세요");
//		String str1 = sc.nextLine();
//		int val1 = Integer.parseInt(str1);
//		System.out.print("y 값을 입력하세요");
//		String str2 = sc.nextLine();
//		int val2 = Integer.parseInt(str2);
//		int rs = val1 + val2;
//		
//		System.out.println(str1 + "+" + str2 +"의 결과는" + rs + "입니다");
		
		while(true) {
			System.out.println("문자를 입력하세요.");
			String data = sc.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력문자열 " + data);
			System.out.println();
		}
		System.out.println("종료됨");
		
	}
}
