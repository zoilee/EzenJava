package Exam;

public class MemberService {
	boolean login(String id,String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	void logout(String id) {
		System.out.println(id + "���� �α׾ƿ� �Ǿ����ϴ�.");
	}
	
	
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		// ����
		
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			
		}else {
			System.out.println("id �Ǵ� password�� ��ġ���� �ʽ��ϴ�.");
		}
		memberService.logout("hong");
	}

}
