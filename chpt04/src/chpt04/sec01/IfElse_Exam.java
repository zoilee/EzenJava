package chpt04.sec01;

import java.util.Scanner;

public class IfElse_Exam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����� ������ �Է��ϼ���>>");
		int score = scanner.nextInt();
		String grade;
//		if(score >= 90) {
//			System.out.println("����� ������ " + score + " �̰� A����Դϴ�.");
//		}else if(score >=80 & score <= 89){
//			System.out.println("����� ������ " + score + " �̰� B����Դϴ�.");
//		}else if (score >=70 & score <= 79) {
//			System.out.println("����� ������ " + score + " �̰� C����Դϴ�.");
//		}else if (score >=60 & score <= 69) {
//			System.out.println("����� ������ " + score + " �̰� D����Դϴ�.");
//		}else {
//			System.out.println("����� ������ " + score + " �̰� �����Դϴ�.");
//		}
		if(score >= 90) {
			grade = "A";
		}else if(score >=80) {
			grade = "B";
		}else if(score >=70) {
			grade = "C";
		}else if(score >= 60) {
			grade = "D";
		}else {
			grade = "����";
		}
		
		System.out.println("����� ������ "+grade+"�Դϴ�.");
	}
}
