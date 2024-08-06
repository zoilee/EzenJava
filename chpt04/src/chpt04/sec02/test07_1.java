package chpt04.sec02;

import java.util.Scanner;

public class test07_1 {
	public static void main(String[] args){
		
		boolean run =true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			System.out.println("====================================");
			System.out.println("1.예금   | 2.출금   | 3.잔고   | 4.종료");
			System.out.println("====================================");
			System.out.print("선택하세요 >>");
			
			int bnum = sc.nextInt();
			switch(bnum) {
			case 1:
				System.out.print("예금액>");
				int addBalance =sc.nextInt();
				System.out.println(addBalance + "원을 입금하셨습니다.");
				balance += addBalance;
			break;
			case 2
				:System.out.print("출금액>");
				int delBalance =sc.nextInt();
				System.out.println(delBalance + "원을 출금하셨습니다.");
				balance -= delBalance;
			break;
			case 3:
				System.out.println("잔고는 "+ balance + "원 입니다");
			break;
			case 4:
				System.out.println("시스템 종료");
				run = false;
			break;
			default:
				System.out.println("잘못 입력했습니다.");
			}
			
		}
	}

}
