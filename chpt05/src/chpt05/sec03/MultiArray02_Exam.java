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
		
		int[] oldArr = {1,2,3};//길이가 3인 배열
		
		//길이가 5인 배열을 새로 생성
		int[] newArr = new int[5];
		
		//oldArr배열의 각 항목을 복사
		for(int i =0; i<oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		for(int i =0; i<newArr.length; i++) {
			System.out.print(newArr[i] + ", ");
		}
		
		// System.arraycopy(원본배열, 원본배열의 복사시작 인덱스, 새배열, 새배열의 붙혀넣기 시작 인덱스,복사 항목수)
		String[] oldArray = {"자바", "자바스크립트", "스타일시트"};
	
		String[] newArray = new String[5];
		
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		
		for( int i=0; i<newArray.length; i++){
			System.out.print(newArray[i]+ ", ");
		}
	
	}

}
