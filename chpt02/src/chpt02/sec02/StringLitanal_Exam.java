package chpt02.sec02;

public class StringLitanal_Exam {

	public static void main(String[] args) {
		
		char var = 'A';
		String var1 = "A";
		String var2 = "홍길동"; 
		String str = "내 이름은 \"홍길동\" 입니다.";
		String str2 = "번호\t이름\t직업";
		String str3 = "내 이름은 \n 홍길동\n 입니다.";
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		
//		String str4 = """
//				+ "\"id\" : \"windter\","
//				+ "\"name\" : \"겨울이\","
//				+"\"char\" : 자바고수\""
//				""";
		String str5 = "{\n\"id\" : \"winter\",\n\"name\" : \"겨울이\",\n\"char\" : \"자바고수\"\n}\n--------------------\n{\n\"id\" : \"spring\",\n\"name\" : \"봄이\",\n\"char\" : \"자바고수 부리는 고수\"\n}";
		
		System.out.println(str5);
	}
	

}
