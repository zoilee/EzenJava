package chapt03.sec03;

public class Logical_Exam {
	
	public static void main(String[] args) {
		
		int charCode = 'b';
		
		if( (65<= charCode ) & (charCode <= 90)) {
			System.out.println("대문자 이군요.");
		}
		
		if( (97 <= charCode) && (charCode <= 122)){
			System.out.println("소문자 이군요.");
		}
		
		if((48 <= charCode) && ( charCode <= 57)){
			System.out.println("숫자 이군요.");
		}
			
	}
}
