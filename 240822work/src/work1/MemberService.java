package work1;

public class MemberService {
	
	private String id = "ezen";
	private int password = 12345;
	
	public boolean login(String id, int password) {
		if(this.id.equals(id)&&this.password == password) {
			return  true;
		}
		return false;

	};
	public void logout() {
		System.out.println("로그아웃 되었습니다.");
	}
	
}
