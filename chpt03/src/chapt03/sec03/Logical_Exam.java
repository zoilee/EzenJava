package chapt03.sec03;

public class Logical_Exam {
	
	public static void main(String[] args) {
		
		int charCode = 'b';
		
		if( (65<= charCode ) & (charCode <= 90)) {
			System.out.println("�빮�� �̱���.");
		}
		
		if( (97 <= charCode) && (charCode <= 122)){
			System.out.println("�ҹ��� �̱���.");
		}
		
		if((48 <= charCode) && ( charCode <= 57)){
			System.out.println("���� �̱���.");
		}
			
	}
}