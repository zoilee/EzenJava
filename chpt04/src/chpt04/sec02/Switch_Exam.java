package chpt04.sec02;

public class Switch_Exam {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*4)+ 8; //8~11��
		System.out.println("���� �ð��� " + num + "���Դϴ�.");
		
		switch(num) {
		case 8:
			System.out.println("��� �մϴ�.");
		break;	
		case 9:
			System.out.println("ȸ�Ǹ� �մϴ�.");
		break;	
		case 10:
			System.out.println("������ ���ϴ�.");
		break;
		default:
			System.out.println("�ܱ��� �����ϴ�.");
		
		}
	}

}
