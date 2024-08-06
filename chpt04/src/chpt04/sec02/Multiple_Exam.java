package chpt04.sec02;

public class Multiple_Exam {

	public static void main(String[] args) {
		
		int[] dans = {2, 5 ,8};
		
		//for(int i = 0; i< dans.length; i++) {
		
		for(int dan : dans) {
			System.out.println("**********"+dan+"´Ü *******");
			for(int j = 1; j<=9; j++) {
			
				System.out.println(dan + "X" + j +"=" + (dan*j));
		}
		
//		
//		for ( int i = 1; i<=9; i++) {
//			switch(i) {
//			case 2:
//				
//			break;
//			}
//			System.out.println("**********"+i+"´Ü *******");
//			for(int j = 1; j<=9; j++) {
//			
//				System.out.println(i + "X" + j +"=" + (i*j));
//			}
//		}
		}
		}
}
