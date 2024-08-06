package chpt06.sec03;

public class Calculator_Exam {

	public static void main(String[] args) {
		
		//객체를 만들자
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		
		int rs = myCalc.plus(5, 10);
		System.out.println("두 수 5 와 8의 합은 " + rs + "입니다.");
		
		int x = 11;
		int y = 4;
		double rs2 = myCalc.divde(x, y);
		System.out.println("두 수 x를 y로 나눈 값은 "+ rs2 + "입니다.");
		
		myCalc.powerOff();
		
		

	}

}
