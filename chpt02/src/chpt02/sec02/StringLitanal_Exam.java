package chpt02.sec02;

public class StringLitanal_Exam {

	public static void main(String[] args) {
		
		char var = 'A';
		String var1 = "A";
		String var2 = "ȫ�浿"; 
		String str = "�� �̸��� \"ȫ�浿\" �Դϴ�.";
		String str2 = "��ȣ\t�̸�\t����";
		String str3 = "�� �̸��� \n ȫ�浿\n �Դϴ�.";
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		
//		String str4 = """
//				+ "\"id\" : \"windter\","
//				+ "\"name\" : \"�ܿ���\","
//				+"\"char\" : �ڹٰ��\""
//				""";
		String str5 = "{\n\"id\" : \"winter\",\n\"name\" : \"�ܿ���\",\n\"char\" : \"�ڹٰ��\"\n}\n--------------------\n{\n\"id\" : \"spring\",\n\"name\" : \"����\",\n\"char\" : \"�ڹٰ�� �θ��� ���\"\n}";
		
		System.out.println(str5);
	}
	

}
