package chpt04.sec02;

public class test05 {

	public static void main(String[] args) {
		int x;
		int y;
		for(x = 0; x<=10;x++ ) {
			for(y=0; y<=10;y++) {
				
				if(x*4 + y*5 == 60) {
					System.out.println("("+x+","+y+")");
				}
			}
		}

	}

}
