package chpt02.sec07;

public class NewCasting3_Exam {

	public static void main(String[] args) {
		
		/*
		 * ������ ���ڿ��� �⺻Ÿ������ ��ȯ�ϴ� ���
		 * 1. byte => Byte.parseByte(������);
		 * 2. short => Short.parseShor(������);
		 * 3. int => Integer.parseInt(������);
		 * 4. long => Long.parseLong(������);
		 * 5. float => Float.parseFloat(������);
		 * 6. double => Double.parseDouble(������);
		 * 7. boolean => Boolean.parseBoolean(������);
		 * 
		 * �⺻Ÿ���� ���ڿ��� ��ȯ
		 * String.valueOf(Ÿ�԰�);
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
