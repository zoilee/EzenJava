package exam;



public class Exan08 {

	
	public static void main(String[] args) {
		int[][] array = {
				{95,96},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for(int l=0; l<array.length; l++) {
			for(int m=0; m<array[l].length; m++) {
				sum += array[l][m];
				count++;
			}
		}
		
		avg = (double) sum /count;
		
		System.out.println("ÃÑÇÕÀº : " +sum);
		System.out.println("Æò±ÕÀº : "+avg);	
		
	}

}
