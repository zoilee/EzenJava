package chpt04.sec02;

import java.util.Scanner;

public class test07 {

	// 전역변수
	static Scanner sc =  new Scanner(System.in);
	static int m;

	
	public static void user() {
		boolean first =true;
		while(first) {
			System.out.println("----------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택>");
			int c = sc.nextInt();
			if(c ==1 ) {
				System.out.print("예금액>");
				int sm = sc.nextInt();
				m += sm;
				System.out.println(sm+" 원 입금 하셨습니다.");
			}else if(c == 2) {
				System.out.print("출금액>");
				int om = sc.nextInt();
				m -= om;
				System.out.println(om+" 원 출금 하셨습니다.");
			}else if(c == 3) {
				System.out.println("현재 계좌에는 "+m+" 원 있습니다");				
			}else if(c == 4 ) {
				System.out.println("이용해주셔서 감사합니다.");
				first = false;
			}else {
				System.out.println("올바른 숫자를 입력해 주세요.");
			}
			
			
			
			
		}
	}
	
	
	public static void main(String[] args) {
		user();

	}

}
