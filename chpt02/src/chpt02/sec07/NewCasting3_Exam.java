package chpt02.sec07;

public class NewCasting3_Exam {

	public static void main(String[] args) {
		
		/*
		 * 숫자형 문자열을 기본타입으로 변환하는 방법
		 * 1. byte => Byte.parseByte(변수명);
		 * 2. short => Short.parseShor(변수명);
		 * 3. int => Integer.parseInt(변수명);
		 * 4. long => Long.parseLong(변수명);
		 * 5. float => Float.parseFloat(변수명);
		 * 6. double => Double.parseDouble(변수명);
		 * 7. boolean => Boolean.parseBoolean(변수명);
		 * 
		 * 기본타입을 문자열로 변환
		 * String.valueOf(타입값);
		 */
		
		String num = "100";
		String pi = "3.14";
		String bl = "true";
		int v1 = Integer.parseInt(num);
		double v2 = Double.parseDouble(pi);
		boolean v3 = Boolean.parseBoolean(bl);
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		String str1 = String.valueOf(v1);
		String str2 = String.valueOf(v2);
		String str3 = String.valueOf(v3);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
