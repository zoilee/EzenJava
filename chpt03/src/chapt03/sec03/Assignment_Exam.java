package chapt03.sec03;

public class Assignment_Exam {

	public static void main(String[] args) {
		
		int rs = 0;
		rs += 10;
		System.out.println(rs);   //10
		
		rs -= 5;
		System.out.println(rs);   //5
		
		rs *= 3;
		System.out.println(rs);  //15
		
		rs /= 5;
		System.out.println(rs);  //3
		rs %= 3;
		System.out.println(rs); //0
		
		//3항 연산
		
		int yourScore = 86;
		char grade = (yourScore > 90)? 'A' : ((yourScore > 80)? 'B' : 'C');
		System.out.println(yourScore + "점은 " + grade + " 등급입니다.");
	}

}
