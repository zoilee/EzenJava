package chpt05.sec02;

public class Replace_Exam {

	public static void main(String[] args) {
		
		String str = "자바 문자열은 변하지 않아요. 왜냐 하면 자바문자열은 String이니까요.";
		String newStr = str.replace("자바", "JAVA");
		
		System.out.println(str);
		System.out.println(newStr);
		
		String ssn = "990824-1230126";
		//1.주민번호의 생년월일만 자르시오.
		//2.태어난 년도만 잘라 출력하시오. ex)yyyy년
		//3.태어난 월을 잘라 출력하시오. ex)mm월
		//4.태어난 일을 잘라 출력하시오. ex)dd일
		//문자열 자르기 : substring( beginIndex, endIndex )
		
		String birth = ssn.substring(0,6);
		System.out.println(birth);
		String year = birth.substring(0,2);
		int intY = Integer.parseInt(year);
		String month = birth.substring(2,4);
		String day = birth.substring(4);
		int rsY;
		if(0 <= intY && 25 > intY) {
			rsY = 2000 + intY;
		}else {
			rsY = 1900 + intY;
		}
		
		System.out.println(rsY+"년 "+month+"월 "+day+"일");
		
		
		int index = str.indexOf("String");
		if(index == -1) {
			System.out.println("찾는 문자열이 없어용!");
		}else {
			System.out.println("찾는 문자열은 "+index+" 위치에서 시작되용!");
		}
		
		String members = "홍길동, 35, 김포시, 남자";
		
		String [] arrMember =members.split(",");
		System.out.println(arrMember[0]);
		System.out.println(arrMember[1]);
		System.out.println(arrMember[2]);
		System.out.println(arrMember[3]);
		
		for (int i=0; i<arrMember.length; i++) {
			System.out.println(arrMember[i]);
		}
		System.out.println();
		for(String mem : arrMember) {
			System.out.println(mem);
		}
	}
	
	
}
