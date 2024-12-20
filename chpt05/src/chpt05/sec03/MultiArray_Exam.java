package chpt05.sec03;

public class MultiArray_Exam {

	public static void main(String[] args) {
		
		//각 반의 학생수가 3명으로 동일하게 2차원 배열 만듬
		int[][] mathScores = new int[2][3];
		
		mathScores[0][0] = 85;
		mathScores[0][1] = 86;
		mathScores[0][2] = 60;
		
		mathScores[1][0] = 40;
		mathScores[1][1] = 90;
		mathScores[1][2] = 70;
		
		//배열의 초깃값 출력
		for(int m=0; m <mathScores.length; m++) {//반의 수
			for(int n= 0; n< mathScores[m].length; n++) {
				System.out.println(m+"번째 반의"+n+"번째 학생 점수"+ mathScores[m][n]+"점");
			}
		}
		
		//전체 학생수
		int totalStudent = 0;
		int totalScore = 0;
		
		for(int i=0; i <mathScores.length; i++) {
			totalStudent += mathScores[i].length; //각 반의 학생수를 합산
			for(int j=0; j <mathScores[i].length; j++) { //해당 반의 학생 수만큼 반복
				totalScore += mathScores[i][j];
			}
		}
		System.out.println("전채 학생의 수" + totalStudent);
		System.out.println("총점 "+ totalScore);
		
		double totalAvg = (double)totalScore/totalStudent;
		System.out.println("전체 평균은 "+ totalAvg + "점" );
		
		//0반학생의 총점과 평균을 구하라.
		//1반학생의 총점과 평균을 구하라.
		int total1Student = 0;
		int total1Score = 0;
		for(int c=0; c <mathScores[0].length; c++) {
				total1Student += mathScores[0].length; //각 반의 학생수를 합산
				total1Score += mathScores[0][c];
			}
		
		System.out.println("전채 학생의 수" + total1Student);
		System.out.println("총점 "+ total1Score);
		
		
	}

}
