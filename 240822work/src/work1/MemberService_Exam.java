package work1;

import java.util.Scanner;

public class MemberService_Exam {

	public static void main(String[] args) {

		MemberService login = new MemberService();
		Scanner sc = new Scanner(System.in);	
		while(true) {
			System.out.print("���̵� �Է� ���ּ���: ");
			String id = sc.nextLine();
			System.out.print("��й�ȣ�� �Է� ���ּ���: ");
			int pass = sc.nextInt();
			sc.nextLine();
			
			if(login.login(id, pass)) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				login.logout();
				break;
			}else{
				System.out.println("id�Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
			}
		}			
	}
}
