package chpt06.sec04;

public class Calculator_Exam {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		//정사각형 넓이
		double rs1 = myCalc.areaRect(14);
		//직사각형
		double rs2 = myCalc.areaRect(13, 22);
		
		System.out.println(rs1+","+ rs2);
	}

}
