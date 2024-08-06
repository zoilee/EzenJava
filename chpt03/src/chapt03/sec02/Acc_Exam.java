package chapt03.sec02;

public class Acc_Exam {

	public static void main(String[] args) {
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double rs = apple - number*pieceUnit;
		
		System.out.println("사과 1개에서 7조각 먹고 남은 양은 " + rs +"조각 입니다.");
		
		int totalPiece = apple * 10;
		int rs2 = totalPiece - number;
		
		System.out.println("사과 1개에서 7조각 먹고 남은 양은 " + rs2 +"조각 입니다.");
	}

}
