package chpt04.sec02;

public class Break_Exam {

	public static void main(String[] args) {
		int i=0;
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num ==6) {
				break;
			}
		}
		System.out.println("시스템 종료");
	}

}
