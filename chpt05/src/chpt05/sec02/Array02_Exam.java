package chpt05.sec02;

public class Array02_Exam {

	public static void main(String[] args) {
		
		int[] arrNum = {12,14,15,50};
		//arrNum = {12,14,15,50};
		for(int num : arrNum) {
			System.out.println(num);
		};
		
		String[] arrStr; //배열이 선언 된 후에 리터럴을 넣으려면 new 타입[]{}을 이용한다
		arrStr = new String[] {"철수","민수","영희"}; 
		for(String num : arrStr) {
			System.out.println(num);
		};
		
		int[] arr1 = new int[3];
		for(int err : arr1) {
			System.out.println(err);
		}
		
		arr1[0] = 12;
		arr1[1] = 20;
		for(int err : arr1) {
			System.out.println(err);
		}
		
		double[] arr2 = new double[3];
		for(double err2 : arr2) {
			System.out.println(err2);
		}
		
		String[] arr3 = new String[3];
		for(String err3 : arr3) {
		System.out.println(err3);
		}	
		
	}

}
