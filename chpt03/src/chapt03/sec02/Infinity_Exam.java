package chapt03.sec02;

public class Infinity_Exam {

	public static void main(String[] args) {
		
		int x = 5;
		double y = 0.0; // infinity
		
		//int rs = 5 / 0; //���� �߻� Exception �߻�
		
		double rs1 = x / y;

		
		if(Double.isInfinite(rs1)||Double.isNaN(rs1)) {
			System.out.println("���� ������ �� �����ϴ�.");
		}else {
			System.out.println(rs1 + 3);
		}
	}

}
