package chpt02.sec07;

import java.util.Scanner;

public class Scanner_Exam {
	public static void main(String[] arg) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("���� �Է��ϼ���. >>");
//		String str = sc.nextLine();
//		
//		System.out.println(str);
		//Ű����� ���� �� ���� �Է� �޾� ���� ����� ����ϼ���!!
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("x ���� �Է��ϼ���");
//		String str1 = sc.nextLine();
//		int val1 = Integer.parseInt(str1);
//		System.out.print("y ���� �Է��ϼ���");
//		String str2 = sc.nextLine();
//		int val2 = Integer.parseInt(str2);
//		int rs = val1 + val2;
//		
//		System.out.println(str1 + "+" + str2 +"�� �����" + rs + "�Դϴ�");
		
		while(true) {
			System.out.println("���ڸ� �Է��ϼ���.");
			String data = sc.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("��¹��ڿ� " + data);
			System.out.println();
		}
		System.out.println("�����");
		
	}
}
