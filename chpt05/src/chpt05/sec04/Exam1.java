package chpt05.sec04;

public class Exam1 {

	public static void main(String[] args) {
		//exam1
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		System.out.println(array.length);
		System.out.println(array[2].length);
		
		//exam2
		int[] array1 = {1,5,3,8,2};
		int max = array1[0];
		int min = array1[0];
		for (int i=0; i<array1.length; i++) {
			if (array1[i] > max) {
				max = array1[i];
			}else if(array1[i] < min) {
				min = array1[i];
			}
		}
		System.out.println("array1의 최대값 : "+ max+ " 최소값 : "+ min);
		
		//exam3
		int[][] array2 = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int rs2 = 0;
		int total = 0;
		for (int i=0; i<array2.length;i++) {
			total += array2[i].length;
			for(int j=0; j<array2[i].length;j++) {
				rs2 += array2[i][j];
			}
		};
		double rs3 = (double) rs2/total;
		System.out.println("전체 합은 "+rs2+" 평균은"+rs3);
		
		//exam4
		
	}

}
