package chapt03.sec01;

public class OverflowUnderflow_Exam {

	public static void main(String[] args) {
		
		byte var1 = 125;
		for(int i=0; i<5; i++) {
			var1++;
			if(var1 == -128 ) {
			System.out.println("오버플로우 발생");
			}
			System.out.println("var1 : "+var1);
		}
		
		System.out.println("------------------");
		byte var2 = -125;
		for(int i=0; i<5; i++) {
			var2--;
			if(var2 == 127 ) {
			System.out.println("언더플로우 발생");
			}
			System.out.println("var2 : "+var2);
		}
		
	}

}
