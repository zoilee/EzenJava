package chpt05.sec02;

public class Array01_Exam {

	public static void main(String[] args) {
		
		String[] season = {"Spring", "Summer", "Fall", "Winter"};
		
		//배열의 항목찾기

		System.out.println("3월부터 5월은 " + season[0] + "입니다.");
		System.out.println("6월부터 8월은 " + season[1] + "입니다.");
		System.out.println("9월부터 11월은 " + season[2] + "입니다.");
		System.out.println("12월부터 2월은 " + season[3] + "입니다.");
		
		//배열의 항목 변경
		
		season[1] = "여름";
		System.out.println("6월부터 8월은 " + season[1] + "입니다.");
		
		//철수는 국어 80점 수학 95점, 영어 83점, 컴퓨터 60점, 역사 90점을 받았습니다.
		//철수 성적의 총점과 평균을 구하세요.
		int[] scores;
		int hab = 0;
		scores = new int[] {80,95,83,60,90};
		for(int score : scores) {
			hab += score;
		}
		System.out.println("철수의 총점은 "+hab+"임.ㅇㅇ");
		int avg = hab/scores.length;
		System.out.println("철수의 평균은 "+avg+"임.ㅇㅇ");
	}

}
