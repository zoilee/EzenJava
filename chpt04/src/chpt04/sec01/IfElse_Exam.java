package chpt04.sec01;

import java.util.Scanner;

public class IfElse_Exam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("당신의 점수를 입력하세요>>");
		int score = scanner.nextInt();
		String grade;
//		if(score >= 90) {
//			System.out.println("당신의 점수는 " + score + " 이고 A등급입니다.");
//		}else if(score >=80 & score <= 89){
//			System.out.println("당신의 점수는 " + score + " 이고 B등급입니다.");
//		}else if (score >=70 & score <= 79) {
//			System.out.println("당신의 점수는 " + score + " 이고 C등급입니다.");
//		}else if (score >=60 & score <= 69) {
//			System.out.println("당신의 점수는 " + score + " 이고 D등급입니다.");
//		}else {
//			System.out.println("당신의 점수는 " + score + " 이고 낙제입니다.");
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
			grade = "낙제";
		}
		
		System.out.println("당신의 학점은 "+grade+"입니다.");
	}
}
