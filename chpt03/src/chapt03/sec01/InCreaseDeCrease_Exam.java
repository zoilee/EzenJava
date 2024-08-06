package chapt03.sec01;

public class InCreaseDeCrease_Exam {

	public static void main(String[] args) {
		
		int x= 10, y=10;
		int z;
		
		x++;
		++x;
		System.out.println("x=" + x); //12
		System.out.println("-------------");
		
		y--;
		--y;
		System.out.println("y="+y); //8
		System.out.println("-------------");
		z = y++;
		
		System.out.println("z=" + z); //13
		System.out.println("y="+y);   //13
		System.out.println("-------------");
		z = ++x;
		System.out.println("z=" + z); //13
		System.out.println("x="+x);   //13
		System.out.println("-------------");
		
		z = ++x + y++;   //14 + 9
		
		System.out.println("z=" + z); //23
		System.out.println("x="+x);   //14
		System.out.println("y="+y);   //10
		System.out.println("-------------");
	}

}
