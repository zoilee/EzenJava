package chpt04.sec02;

import java.util.Scanner;

public class test07 {

	// ��������
	static Scanner sc =  new Scanner(System.in);
	static int m;

	
	public static void user() {
		boolean first =true;
		while(first) {
			System.out.println("----------------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------------------------");
			System.out.print("����>");
			int c = sc.nextInt();
			if(c ==1 ) {
				System.out.print("���ݾ�>");
				int sm = sc.nextInt();
				m += sm;
				System.out.println(sm+" �� �Ա� �ϼ̽��ϴ�.");
			}else if(c == 2) {
				System.out.print("��ݾ�>");
				int om = sc.nextInt();
				m -= om;
				System.out.println(om+" �� ��� �ϼ̽��ϴ�.");
			}else if(c == 3) {
				System.out.println("���� ���¿��� "+m+" �� �ֽ��ϴ�");				
			}else if(c == 4 ) {
				System.out.println("�̿����ּż� �����մϴ�.");
				first = false;
			}else {
				System.out.println("�ùٸ� ���ڸ� �Է��� �ּ���.");
			}
			
			
			
			
		}
	}
	
	
	public static void main(String[] args) {
		user();

	}

}