package chpt06.sec04;

public class Calculator_Exam {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		//���簢�� ����
		double rs1 = myCalc.areaRect(14);
		//���簢��
		double rs2 = myCalc.areaRect(13, 22);
		
		System.out.println(rs1+","+ rs2);
	}

}
