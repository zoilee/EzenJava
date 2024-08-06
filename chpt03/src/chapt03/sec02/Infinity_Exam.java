package chapt03.sec02;

public class Infinity_Exam {

	public static void main(String[] args) {
		
		int x = 5;
		double y = 0.0; // infinity
		
		//int rs = 5 / 0; //예외 발생 Exception 발생
		
		double rs1 = x / y;

		
		if(Double.isInfinite(rs1)||Double.isNaN(rs1)) {
			System.out.println("값을 산출할 수 없습니다.");
		}else {
			System.out.println(rs1 + 3);
		}
	}

}
