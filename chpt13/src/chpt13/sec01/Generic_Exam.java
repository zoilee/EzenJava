package chpt13.sec01;

public class Generic_Exam {

	public static void main(String[] args) {
		Box <String> box1 = new Box<>();
		box1.Content = "±èÃ¶¼ö"; 
		String str = box1.Content;
		System.out.println(str);
		
		Box <Integer> box2 = new Box<>();
		box2.Content = 1000;
		int num = box2.Content;
		System.out.println(num);
	}

}
