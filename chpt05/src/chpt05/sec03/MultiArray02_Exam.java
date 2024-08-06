package chpt05.sec03;

public class MultiArray02_Exam {

	public static void main(String[] args) {
		String[] strArr = new String[3];
		strArr[0] = "Java";
		strArr[1] = "Java";
		strArr[2] = new String("Java");
		
		System.out.println(strArr[0] == strArr[1]);
		System.out.println(strArr[0] == strArr[2]);
		System.out.println(strArr[0].equals(strArr[2]));
		
		int[] oldArr = {1,2,3};//���̰� 3�� �迭
		
		//���̰� 5�� �迭�� ���� ����
		int[] newArr = new int[5];
		
		//oldArr�迭�� �� �׸��� ����
		for(int i =0; i<oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		for(int i =0; i<newArr.length; i++) {
			System.out.print(newArr[i] + ", ");
		}
		
		// System.arraycopy(�����迭, �����迭�� ������� �ε���, ���迭, ���迭�� �����ֱ� ���� �ε���,���� �׸��)
		String[] oldArray = {"�ڹ�", "�ڹٽ�ũ��Ʈ", "��Ÿ�Ͻ�Ʈ"};
	
		String[] newArray = new String[5];
		
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		
		for( int i=0; i<newArray.length; i++){
			System.out.print(newArray[i]+ ", ");
		}
	
	}

}