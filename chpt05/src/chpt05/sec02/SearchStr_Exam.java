package chpt05.sec02;

public class SearchStr_Exam {

	public static void main(String[] args) {
		String str = "�ڹ� ���α׷���";
		
		int java = str.indexOf("�ڹ�");
		if(java == -1) {
			System.out.println("�ڹٿ� ���� ���� å�Դϴ�.");
		}else{
			System.out.println("�ڹٿ� ���õ� ���� �Դϴ�.");
		}
		
		
		Boolean pro = str.contains("���α׷���");
		if(pro == true) {
			System.out.println("���α׷��� ���� �����Դϴ�.");
		}else{
			System.out.println("���α׷��ְ� ������ ���� �����Դϴ�.");
		}
		
	
	}

}