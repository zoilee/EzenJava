package chpt02.sec02;

public class TextBlock_Exam {

	public static void main(String[] args) {
		
		
		String str = "{\n\"id\" : \"winter\",\n\"name\" : \"�ܿ���\",\n\"char\" : \"�ڹٰ��\"\n}\n--------------------\n{\n\"id\" : \"spring\",\n\"name\" : \"����\",\n\"char\" : \"�ڹٰ�� �θ��� ���\"\n}";
		
		System.out.println(str);
		
		
		String str2 = ""+
		"{\n"+
		"\t\"id\" : \"winter\", \n" +
		"\t\"name\" : \"�ܿ���\", \n" +
		"\t\"char\" : \"�ڹٰ��\" \n" +
		"}\n\n" +
		"----------------------------\n\n"+
		"{\n"+
		"\t\"id\" : \"spring\", \n" +
		"\t\"name\" : \"����\", \n" +
		"\t\"char\" : \"�ڹٰ�� �θ��� ���\" \n" +
		"}\n";
		System.out.println(str2);
	}

}
