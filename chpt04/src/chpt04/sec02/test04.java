package chpt04.sec02;

public class test04 {
	public static void main(String[] args) {
		boolean first = true;
		while(first) {
			int d1 = (int)(Math.random()*6+1);
			int d2 = (int)(Math.random()*6+1);
			System.out.println("d1은 "+d1+"  d2은 "+d2);
			if(d1 + d2 == 5) {
				System.out.println("합이 5이므로 시스템을 종료합니다");
				first = false;
			}
		}
	}
}
