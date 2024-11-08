package vending;

import java.util.Scanner;

public class coffee {

	
	static int price = 300;
	static Scanner sc = new Scanner(System.in);
	
	public static void user () {
		boolean first = true;
		int money = 0;
		
		while(true) {
			System.out.println("++++++++++++++++++++++++++++++");
			System.out.println("커피자판기입니당 가격은300원이에요");
			System.out.println("++++++++++++++++++++++++++++++");
			
			if(first) {
				System.out.print("돈을 넣어주세요");
				money = sc.nextInt();
				first = false;
			}
			if(money<price) {
				System.out.println("금액이 부족합니당");
				first = true;
				continue;
			}
			if(money>price) {
				int count = (money / price);
				int change = (money % price);
				System.out.println("++++++++++++++++++++++++++++++");
				System.out.println("커피가 "+count+"잔 나왔습니당");
				System.out.println("거스름돈은 "+change+"입니당.");
				System.out.println("++++++++++++++++++++++++++++++");
				first = true;
				continue;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		user();
		return;
	}

}
