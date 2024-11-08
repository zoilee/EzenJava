package record;

import java.util.Scanner;

public class student {
	
	public static final int Max  = 30;
	
	
	static String[] name = new String[Max];
	static int[] kor = new int[Max];
	static int[] eng = new int[Max];
	static int[] math = new int[Max];
	
	public static void init() {
		name[0] = "이름1";
		kor[0] = 80;
		eng[0] = 70;
		math[0] = 100;
		
		name[1] = "이름2";
		kor[1] = 100;
		eng[1] = 90;
		math[1] = 60;				
	}
	
	static Scanner sc = new Scanner(System.in);
	static int status = 0;
	static float passScore = 60;
	
	public static void user() {
		System.out.println("+++++++++++++++++++++++++++++++");
		System.out.println("성적확인 프로그램");
		System.out.println("뭐할래");
		System.out.println("1: 합격여부 2: 학생추가(아직안함)  3: 전체확인 ");
		status = sc.nextInt();
		
		switch(status) {
		case 1:
			System.out.println("누구의 합격여부 볼꺼임?");
			String who = "";
			for(int i = 0;  i < name.length; i++) {
				if (name[i] != null) {
			        String std = i + "." + name[i] + " ";
			        who += std;
			    }
			}
			System.out.println(who);
			int check =  sc.nextInt();
			for(int j = 0; j<= check; j++) {
				if (j == check) {
					System.out.println("이름: " + name[j] +" 국어 :" + kor[j]+" 영어 :" + eng[j]+ " 수학 :" + math[j]);
					int total = kor[j] + eng[j] + math[j];
					float avg = total / 3.0f;
					if(avg > passScore) {
						System.out.println("평균점수 " + avg + " 합격입니다.");
					}else if(avg < passScore){
						System.out.println("평균점수 " + avg + " 불합격입니다.");
					}
					
				}
			} 
			
			break;
		case 3:
			for(int i = 0; i< name.length; i++) {
				if(name[i] != null) {
					System.out.println("이름: " + name[i] +" 국어 :" + kor[i]+" 영어 :" + eng[i]+ " 수학 :" + math[i]);
				}
			}
			break;
			
		}
	}
	
	
	public static void main(String[] args) {
		init();
		user();

	}

}
