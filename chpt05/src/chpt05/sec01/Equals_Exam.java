package chpt05.sec01;

public class Equals_Exam {

	public static void main(String[] args) {

		String str1 = "ȫ�浿";
		String str2 = "ȫ�浿";
		
		if(str1 == str2) {
			System.out.println("str1�� str2�� �����ϴ�");
		}else {
			System.out.println("str1�� str2�� �ٸ��ϴ�.");
		}
		
		String str3 = new String("ȫ�浿");
		if(str3 == str1) {
			System.out.println("str1�� str3�� �����ϴ�.");
		}else {
			System.out.println("str1�� str3�� �ٸ��ϴ�.");
		}
		
		//���ڿ��� ���� �ٸ��� ������ ���� java������ equals()�� �̿��Ѵ�.
		if(str3.equals(str1)) {
			System.out.println("str1�� str3�� �����ϴ�.");
		}else {
			System.out.println("str1�� str3�� �ٸ��ϴ�.");
		}
	}

}
