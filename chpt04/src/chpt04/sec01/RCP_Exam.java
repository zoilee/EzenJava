package chpt04.sec01;

import java.util.Scanner;

public class RCP_Exam {
	//��������
	static Scanner sc = new Scanner(System.in); 
	static String myy = new String ("defalut");
	
	//�ʱ�ȭ
	public static void init() {
		
	}
	
	
	//user interface
	public static void user() {   //user interface
		Boolean first = true;
		while(true) {
			System.out.print("1: ���� 2: ���� 3:�� /���ڸ� �����ϼ���>>");
			int my = sc.nextInt();
			if(my == 1) {
				System.out.println("����� ������ ���̽��ϴ�.");
			}else if (my == 2) {
				System.out.println("����� ������ ���̽��ϴ�.");
			}else if (my == 3) {
				System.out.println("����� ���� ���̽��ϴ�.");
			}else{
				System.out.println("�ùٸ� ���ڸ� �Է����ּ���");
				continue;
			}
		}
	}
	
	public static void main(String[] args) {
		int com = (int)(Math.random()*4)+1;
		
		user();
		
//		System.out.println(my);
//		int rs = 0;    //rs = 1 draw 2 win 3 lose
//		if(com == my) {
//			rs = 1;
//		}else if(com == 1 & my == 2) {
//			rs = 2;
//		}else if(com == 1 & my == 3) {
//			rs = 3;
//		}else if(com == 2 & my == 1) {
//			rs = 3;
//		}else if(com == 2 & my == 3) {
//			rs = 2;
//		}else if(com == 3 & my == 1) {
//			rs = 2;
//		}else if(com == 3 & my == 2) {
//			rs = 3;
//		}
//		if (rs == 1) {
//			System.out.println("you draw");
//		}else if(rs == 2) {
//			System.out.println("you win");
//		}else {
//			System.out.println("you lose");
//		}
	}
}