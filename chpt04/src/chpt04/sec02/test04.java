package chpt04.sec02;

public class test04 {
	public static void main(String[] args) {
		boolean first = true;
		while(first) {
			int d1 = (int)(Math.random()*6+1);
			int d2 = (int)(Math.random()*6+1);
			System.out.println("d1�� "+d1+"  d2�� "+d2);
			if(d1 + d2 == 5) {
				System.out.println("���� 5�̹Ƿ� �ý����� �����մϴ�");
				first = false;
			}
		}
	}
}