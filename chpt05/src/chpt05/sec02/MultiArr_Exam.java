package chpt05.sec02;

public class MultiArr_Exam {

	public static void main(String[] args) {
		
		//2차원 배열
		
		int[][] scores = {
				{90, 85, 60},
				{76, 88}
		};
		
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		System.out.println(scores[0][2]);
		System.out.println(scores[1][1]);
		
		//1반의 평균 점수를 구하라.
		//2반의 평균 점수를 구하라.
		//전체 학생의 평균 점수를 구하라.
		int hab1 = 0;
		
		for(int i : scores[0]) {
			hab1 += i;
		}
		int avg1 = hab1/scores[0].length;
		System.out.println(avg1);
		
		int hab2 = 0;
		for(int i : scores[1]) {
			hab2 +=i;
		}
		int avg2 = hab2/scores[1].length;
		System.out.println(avg2);
		
		
		
		int hab3 = 0;
		int total = 0;

		for(int i = 0;i<scores.length;i++) {
			for(int j = 0;j<scores[i].length;j++) {
					hab3 += scores[i][j];
					total++;
			}
		}
//		int avg3 = hab3/(scores[0].length+scores[1].length);
		int avg3 = hab3/total;
		System.out.println(hab3);
		System.out.println(avg3);
	}

}
