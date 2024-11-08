package Reservation;

import java.util.Scanner;

public class MovieTicket {
	public static final int Max  = 5;
	
	
	static String[] name = new String[Max];
	static int[] count = new int[Max];
	
	static Scanner sc = new Scanner(System.in);
	static int status = 0;
	
	public static void init() {
		name[0] = "영화1";
		count[0] = 20;
		
		name[1] = "영화2";
		count[1] = 10;
		
		name[2] = "망작";
		count[2] = 0;
	
				
	}
	
	public static void res() {
		System.out.println("+++++++++++++++++++++++++++++++");
		System.out.println("영화예약 프로그램");
		System.out.println("뭐할래");
		System.out.println("1: 예매할께요!");
		status = sc.nextInt();
		
		switch(status) {
		case 1:
			System.out.println("어떤 영화 볼꺼임?");
			String what = "";
			for(int i = 0;  i < name.length; i++) {
				if (name[i] != null) {
			        String std = i + "." + name[i] + " ";
			        what += std;
			    }
			}
			System.out.println(what);
			int check =  sc.nextInt();
			if (check >= 0 && check < Max && name[check] != null) {
				System.out.println("이름: " + name[check] +" 남은 좌석수 " + count[check]);
				System.out.println("1: 예매할께요! 2:흠 그정돈가");
				int real =  sc.nextInt();
				if(real == 1) {
					if(count[check] >0) {
					count[check]--; 
					System.out.println("이름: " + name[check] +" 남은 좌석수 " + count[check]);
					res();
					}else {
						System.out.println("좌석이 없다 미안하다..");
						res();
					}
				} else {
					System.out.println("예매를 취소하셨습니다.");
					res();
				}
			} else {
				System.out.println("유효하지 않은 영화 번호입니다.");
				res();
			}		
			break;
			
		default:
			System.out.println("잘못된 입력입니다.");
			res();
			break;			
		}
		
		
	}
	
	public static void main(String[] args) {
		init();
		res();
	}
}
