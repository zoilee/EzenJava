package chpt05.sec02;

public class Array02_Exam {

	public static void main(String[] args) {
		
		int[] arrNum = {12,14,15,50};
		//arrNum = {12,14,15,50};
		for(int num : arrNum) {
			System.out.println(num);
		};
		
		String[] arrStr; //�迭�� ���� �� �Ŀ� ���ͷ��� �������� new Ÿ��[]{}�� �̿��Ѵ�
		arrStr = new String[] {"ö��","�μ�","����"}; 
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