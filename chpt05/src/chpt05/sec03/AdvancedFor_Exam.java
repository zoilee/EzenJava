package chpt05.sec03;

public class AdvancedFor_Exam {

	public static void main(String[] args) {
		int[] scores = {95,71,84,93,87};
		int sum = 0;

		for(int adv : scores) {
			sum += adv;

		}
		
		double avg = (double) sum/scores.length ;
	
		System.out.println(sum);		
		System.out.println(avg);

	}

}
