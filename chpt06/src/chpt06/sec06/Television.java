package chpt06.sec06;

public class Television {
	static String company = "LG";
	static String model = "OLED";
	static String info; //정적 필드변수를 선언 한 후
	static {
		info = company + "-"+ model;
	}
}
