package chpt04.sec02;

import java.util.Scanner;

public class test07_1 {
	public static void main(String[] args){
		
		boolean run =true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			System.out.println("====================================");
			System.out.println("1.����   | 2.���   | 3.�ܰ�   | 4.����");
			System.out.println("====================================");
			System.out.print("�����ϼ��� >>");
			
			int bnum = sc.nextInt();
			switch(bnum) {
			case 1:
				System.out.print("���ݾ�>");
				int addBalance =sc.nextInt();
				System.out.println(addBalance + "���� �Ա��ϼ̽��ϴ�.");
				balance += addBalance;
			break;
			case 2
				:System.out.print("��ݾ�>");
				int delBalance =sc.nextInt();
				System.out.println(delBalance + "���� ����ϼ̽��ϴ�.");
				balance -= delBalance;
			break;
			case 3:
				System.out.println("�ܰ�� "+ balance + "�� �Դϴ�");
			break;
			case 4:
				System.out.println("�ý��� ����");
				run = false;
			break;
			default:
				System.out.println("�߸� �Է��߽��ϴ�.");
			}
			
		}
	}

}
