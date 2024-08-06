package chpt02.sec02;

public class TextBlock_Exam {

	public static void main(String[] args) {
		
		
		String str = "{\n\"id\" : \"winter\",\n\"name\" : \"겨울이\",\n\"char\" : \"자바고수\"\n}\n--------------------\n{\n\"id\" : \"spring\",\n\"name\" : \"봄이\",\n\"char\" : \"자바고수 부리는 고수\"\n}";
		
		System.out.println(str);
		
		
		String str2 = ""+
		"{\n"+
		"\t\"id\" : \"winter\", \n" +
		"\t\"name\" : \"겨울이\", \n" +
		"\t\"char\" : \"자바고수\" \n" +
		"}\n\n" +
		"----------------------------\n\n"+
		"{\n"+
		"\t\"id\" : \"spring\", \n" +
		"\t\"name\" : \"봄이\", \n" +
		"\t\"char\" : \"자바고수 부리는 고수\" \n" +
		"}\n";
		System.out.println(str2);
	}

}
