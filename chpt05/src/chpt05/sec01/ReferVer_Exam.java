package chpt05.sec01;

public class ReferVer_Exam {

	public static void main(String[] args) {
		
		int[] arr1; //�迭���� ����
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1, 2, 3}; //�迭 {1, 2, 3}�� ���� ���� arr1�� ����
		arr2 = new int[] {1, 2, 3};
		arr3 = arr2;
		
		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3);
	}

}
