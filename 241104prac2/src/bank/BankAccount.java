package bank;

import java.util.Scanner;

public class BankAccount {
	static int money = 0;
	static Scanner sc = new Scanner(System.in);
	static int status = 0;
	
	public static void user() {
		System.out.println("+++++++++++++++++++++++++++++++");
		System.out.println("입출금시스템입니다");
		System.out.println("원하시는 서비스를 선택해주세요");
		System.out.println("1: 입금 2: 출금 3: 현재잔액");
		status = sc.nextInt();
		
		switch(status) {
		case 1:
			System.out.println("입금하실 돈을 넣어주세요");
			int addmoney =  sc.nextInt();
			money += addmoney;
			System.out.println("입금이 완료됬습니다.");
			break;
			
		case 2:
			System.out.println("출금하실 돈을 넣어주세요");
			int decmoney = sc.nextInt();
			if(decmoney>money) {
				System.out.println("잔액이 모자랍니다.");
				return;
			}
			if(decmoney<money) {
				money -= decmoney;
				System.out.println("출금이 완료됬습니다.");
			}
			break;
		case 3:
			System.out.println("현재 잔액은 " + money + "원 입니다.");
			break;
		case 1234:
			System.out.println("초기 잔액 설정을 입력해주세요");
			money = sc.nextInt();
			return;
		}
		
	}
	public static void main(String[] args) {
		while (true) {
			user();
		}
	
	}
}
