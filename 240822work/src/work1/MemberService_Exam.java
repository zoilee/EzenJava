package work1;

import java.util.Scanner;

public class MemberService_Exam {

	public static void main(String[] args) {

		MemberService login = new MemberService();
		Scanner sc = new Scanner(System.in);	
		while(true) {
			System.out.print("아이디를 입력 해주세요: ");
			String id = sc.nextLine();
			System.out.print("비밀번호를 입력 해주세요: ");
			int pass = sc.nextInt();
			sc.nextLine();
			
			if(login.login(id, pass)) {
				System.out.println("로그인 되었습니다.");
				login.logout();
				break;
			}else{
				System.out.println("id또는 password가 올바르지 않습니다.");
			}
		}			
	}
}
