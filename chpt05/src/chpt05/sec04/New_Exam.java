package chpt05.sec04;

import java.util.Calendar;

public class New_Exam {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();//��¥ �ð������� �������� class
		Week today = null; //Week ���� Ÿ�� ���� ����
		
		//������ ���� ���
		int week = cal.get(Calendar.DAY_OF_WEEK);
		switch(week) {
		case 1 : today = Week.SUNDAY; break;
		case 2 : today = Week.MONDAY; break;
		case 3 : today = Week.TUESDAY; break;
		case 4 : today = Week.WEDNESDAY; break;
		case 5 : today = Week.THURSDAY; break;
		case 6 : today = Week.FRIDAY; break;
		case 7 : today = Week.SATURDAY; break;
		}
		
		if(today == Week.FRIDAY) {
			System.out.println("�ұݿ��� ȫ���,,,");
		}else {
			System.out.println("������ �ڹٰ��θ� �մϴ�");
		}
	}

}