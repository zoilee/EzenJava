package chpt11.sec01;

public class Exception3Handling_Exam {

	public static void main(String[] args) {
		String[] array = {"100", "Ioo"};
		
		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array["+i+"]:" + value);
			}catch(ArrayIndexOutOfBoundsException  | NumberFormatException e) {
				System.out.println("배열의 인덱스가 초과됨." + e.getMessage());
			}catch(Exception e) {
				System.out.println("에러자나" + e.getMessage());
			}
		};

	}

}
