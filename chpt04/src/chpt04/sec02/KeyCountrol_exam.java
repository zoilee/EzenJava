package chpt04.sec02;

import java.util.Scanner;

public class KeyCountrol_exam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true; //while�� ����
		int speed = 0;
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1. Acc | 2. Dec | 3. break");
			System.out.println("-----------------------");
			System.out.print("���� >>>");
			
			String strNum = sc.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("���� �ӵ� = " + speed);
			}else if(strNum.equals("2")) {
				speed--;
				System.out.println("���� �ӵ� = " + speed);
			}else if(strNum.equals("3")) {
				run = false;
			}else {
				System.out.println("�ùٸ� ���ڷ� �ٽ� �����ض�");
			}
		}

	}

}
