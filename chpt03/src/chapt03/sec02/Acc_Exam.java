package chapt03.sec02;

public class Acc_Exam {

	public static void main(String[] args) {
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double rs = apple - number*pieceUnit;
		
		System.out.println("��� 1������ 7���� �԰� ���� ���� " + rs +"���� �Դϴ�.");
		
		int totalPiece = apple * 10;
		int rs2 = totalPiece - number;
		
		System.out.println("��� 1������ 7���� �԰� ���� ���� " + rs2 +"���� �Դϴ�.");
	}

}
