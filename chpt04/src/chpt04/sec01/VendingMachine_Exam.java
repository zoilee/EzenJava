package chpt04.sec01;

import java.util.Scanner;

public class VendingMachine_Exam {
	
	//필드
	//생성자
	//매소드
	public static final int Max = 10; //메뉴의 최대 갯수는 10개
	
	//전역변수
	static String[] box = new String[Max];
	static int[] price = new int[Max];
	static int[] stock = new int[Max];
	static int count = 3; //메뉴의 갯수
	static int admin = 1234; //관리자 비번
	static int profit = 0; //총수익
	static Scanner sc = new Scanner(System.in);
	
	//자판기 초기화
	public static void init() {
		box[0] = "콜라";
		price[0] = 1000;
		stock[0] = 3;
		
		box[1] = "사이다";
		price[1] = 1200;
		stock[1] = 3;
		
		box[2] = "환타";
		price[2] = 1500;
		stock[2] = 3;
	}
	public static void admin() {
		while(true) {
			System.out.println("++++++++++++++++++++++++++++++++++++++");
			System.out.println("관리자 모드 진입");
			System.out.println("1: 메뉴 변경 2: 가격 변경 3: 재고 추가 4:메뉴 추가 5: 수익 확인 0: 종료");
			System.out.print("번호를 입력하세요. >>");
			int num = sc.nextInt();
			System.out.println("++++++++++++++++++++++++++++++++++++++");
			
			int i = 0;
			int j = 0;
			String name;
			switch(num) {
			
				case 1:
					System.out.print("변경할 메뉴의 번호를 입력 하세요. (1 ~ "+count+") >> ");
					i = sc.nextInt();
					System.out.print(box[i-1] + "를(을) 무엇으로 바꾸시겠습니까?");
					sc.nextLine();
					name = sc.next();
					
					System.out.print(name + "의 가격은 얼마입니까?");
					int ii = sc.nextInt();
					
					System.out.print(name + "의 재고를 몇 개 등록 하시겠습니까? >>");
					int n = sc.nextInt();
					
					box[i-1] = name;
					price[i-1] = ii;
					stock[i-1] = n;
					System.out.println("메뉴 변경이 완료 되었습니다.");
					
				break;
				case 2:  //가격변경
					System.out.print("가격 변경할 메뉴의 번호를 입력하세요. (1~ "+count+") >>");
					i = sc.nextInt();
					System.out.print(box[i-1] + "를(을) 얼마로 바꾸시겠습니까?");
					int pp = sc.nextInt();
					price[i-1] = pp;
					System.out.println("가격 변경이 완료 되었습니다.");
					
;				break;
				case 3:  //재고추가
					System.out.print("재고 추가할 메뉴의 번호를 입력 하세요. (1 ~ "+count+") >> ");
					i = sc.nextInt();
					System.out.print(box[i-1] + "을 몇 개 추가 하시겠습니까?");
					int ss = sc.nextInt();
					stock[i-1] += ss;
					System.out.println("재고 추가가 완료되었습니다.");
				break;
				case 4:  //메뉴추가
					if(count > Max -1) {
						System.out.print("더 이상 메뉴를 추가할 자리가 없습니다.");
						continue;
					}else {
						System.out.print("추가할 메뉴의 이름을 입력하세요. >>");
						sc.nextLine();
						name = sc.next();
						
						System.out.print("추가할 메뉴의 가격을 입력하세요. >>");
						i = sc.nextInt();
						
						System.out.print("추가할 메뉴의 재고는 몇 개입니까? >>");
						j = sc.nextInt();
						
						box[count] = name;
						price[count] = i;
						stock[count] = j;
						count++;
						System.out.println("메뉴 추가가 완료 되었습니다.");
					}
				break;
				case 5:  //수익확인
					System.out.println("현재까지의 수익은 "+ profit + "원 입니다.");
				break;
				case 0:  //종료
					user();
					
				break;
			
			}
		}
	}
	//유저 인터페이스 담당 메소드
	public static void user() {
		Boolean first = true;
		int money = 0;
		
		while(true) {
			System.out.println("++++++++++++++++++++++++++++++++++++++");
			System.out.println("시원한 음료수 자판기 입니다. (번호: 상품(재고))");
			//번호: 메뉴(가격) - 재고
			for(int i=0; i<count;i++) {
				System.out.print((i+1) + ":" +box[i]+"(" + price[i] + "원) -" + stock[i]+"개     ");
			}
			System.out.println();
			System.out.println("++++++++++++++++++++++++++++++++++++++");
			
			//돈을 입력 받아야 함.
			if(first) {
				System.out.print("돈을 넣어주세요: ");
				money = sc.nextInt();
				first = false;
			}
			
			if(money == 1234) {
				admin();
				return;
			};
			
			System.out.print("메뉴를 선택 하세요: :");
			int num = sc.nextInt();
			
			//가격을 확인해서 돈이 충분한지 검사
			if (money >= price[num-1]) {
				//재고가 충분한지 확인
				if(stock[num-1]>0) {
					money = money - price[num-1];
					stock[num-1]--;
					profit += price[num-1];
					System.out.println(box[num-1]+"이 나왔습니다. 시원하게 드세요");
				}else {
					System.out.println("현재 재고가 부족합니다.");
					continue;
				}
			}else {
				System.out.println("잔액이 부족합니다.");
			}
			
			System.out.println("잔액 : " + money);
			
			if(money == 0) {
				System.out.println("감사합니다. 다음에 또 이용해 주세요");
				first = true;
				continue;
			}
			
			//돈이 남아있을 때 계속구매, 돈을 추가, 잔돈반환
			System.out.println("1: 계속 구매하기  2: 금액 추가하기 3: 잔돈반환하기");
			int num1 = sc.nextInt();
			if(num1 == 1) {
				continue;
			}else if (num1 == 2) {
				System.out.println("돈을 넣어 주세요. >>");
				int extra = sc.nextInt();
				money += extra;
				System.out.println("금액이 추가 되었습니다. 잔액 :" +money);
			}else if (num1 ==3) {
				System.out.println("거스름 돈 " + money + "원이 반환됩니다.");
				System.out.println("감사합니다 또 이용해 주세요");
				first = true;
			}
		}
	}
	
	public static void main(String[] args) {
		init();
		user();
		return;
	}
}
