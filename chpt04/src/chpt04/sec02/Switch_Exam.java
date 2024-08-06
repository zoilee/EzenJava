package chpt04.sec02;

public class Switch_Exam {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*4)+ 8; //8~11시
		System.out.println("현재 시간은 " + num + "시입니다.");
		
		switch(num) {
		case 8:
			System.out.println("출근 합니다.");
		break;	
		case 9:
			System.out.println("회의를 합니다.");
		break;	
		case 10:
			System.out.println("업무를 봅니다.");
		break;
		default:
			System.out.println("외근을 나갑니다.");
		
		}
	}

}
