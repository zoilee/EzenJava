package exam;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run= true;
		int[] scores = null;
		int studentNum = 0;
		
		while(run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("------------------------------------------------------");
			System.out.print("����>");
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			
				case 1:
					System.out.print("�л� ��>");
					studentNum = Integer.parseInt(sc.nextLine());
					scores = new int[studentNum];
				break;
				
				case 2:
					for(int i=0; i< scores.length; i++) {
					System.out.println((i+1)+"�� �л� ����>>");
						scores[i] = Integer.parseInt(sc.nextLine());
					}
				break;
				
				case 3:
					for(int i=0; i<scores.length; i++) {
						System.out.println((i+1)+"�� �л� ����>>"+scores[i]);
					}
				break;
				
				case 4:
					int sum = 0;
					int max = 0;
					double avg =0;
					for (int i=0; i<scores.length; i++) {
						max =(max<scores[i])? scores[i]:max;
						sum += scores[i];
						
					}
					avg = (double) sum/ studentNum;
					System.out.println("�ְ� ���� : " + max);
					System.out.println("��� ���� : " + avg);
				break;
				
				case 5:
					run = false;
				break;
			};
		}

	}
}
