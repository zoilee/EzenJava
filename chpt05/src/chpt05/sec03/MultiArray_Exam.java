package chpt05.sec03;

public class MultiArray_Exam {

	public static void main(String[] args) {
		
		//�� ���� �л����� 3������ �����ϰ� 2���� �迭 ����
		int[][] mathScores = new int[2][3];
		
		mathScores[0][0] = 85;
		mathScores[0][1] = 86;
		mathScores[0][2] = 60;
		
		mathScores[1][0] = 40;
		mathScores[1][1] = 90;
		mathScores[1][2] = 70;
		
		//�迭�� �ʱ갪 ���
		for(int m=0; m <mathScores.length; m++) {//���� ��
			for(int n= 0; n< mathScores[m].length; n++) {
				System.out.println(m+"��° ����"+n+"��° �л� ����"+ mathScores[m][n]+"��");
			}
		}
		
		//��ü �л���
		int totalStudent = 0;
		int totalScore = 0;
		
		for(int i=0; i <mathScores.length; i++) {
			totalStudent += mathScores[i].length; //�� ���� �л����� �ջ�
			for(int j=0; j <mathScores[i].length; j++) { //�ش� ���� �л� ����ŭ �ݺ�
				totalScore += mathScores[i][j];
			}
		}
		System.out.println("��ä �л��� ��" + totalStudent);
		System.out.println("���� "+ totalScore);
		
		double totalAvg = (double)totalScore/totalStudent;
		System.out.println("��ü ����� "+ totalAvg + "��" );
		
		//0���л��� ������ ����� ���϶�.
		//1���л��� ������ ����� ���϶�.
		int total1Student = 0;
		int total1Score = 0;
		for(int c=0; c <mathScores[0].length; c++) {
				total1Student += mathScores[0].length; //�� ���� �л����� �ջ�
				total1Score += mathScores[0][c];
			}
		
		System.out.println("��ä �л��� ��" + total1Student);
		System.out.println("���� "+ total1Score);
		
		
	}

}