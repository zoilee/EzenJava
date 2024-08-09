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
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
	
	
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		// 성공
		
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			
		}else {
			System.out.println("id 또는 password가 일치하지 않습니다.");
		}
		memberService.logout("hong");
	}

}
