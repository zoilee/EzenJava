package chpt05.sec02;

public class Array01_Exam {

	public static void main(String[] args) {
		
		String[] season = {"Spring", "Summer", "Fall", "Winter"};
		
		//�迭�� �׸�ã��

		System.out.println("3������ 5���� " + season[0] + "�Դϴ�.");
		System.out.println("6������ 8���� " + season[1] + "�Դϴ�.");
		System.out.println("9������ 11���� " + season[2] + "�Դϴ�.");
		System.out.println("12������ 2���� " + season[3] + "�Դϴ�.");
		
		//�迭�� �׸� ����
		
		season[1] = "����";
		System.out.println("6������ 8���� " + season[1] + "�Դϴ�.");
		
		//ö���� ���� 80�� ���� 95��, ���� 83��, ��ǻ�� 60��, ���� 90���� �޾ҽ��ϴ�.
		//ö�� ������ ������ ����� ���ϼ���.
		int[] scores;
		int hab = 0;
		scores = new int[] {80,95,83,60,90};
		for(int score : scores) {
			hab += score;
		}
		System.out.println("ö���� ������ "+hab+"��.����");
		int avg = hab/scores.length;
		System.out.println("ö���� ����� "+avg+"��.����");
	}

}