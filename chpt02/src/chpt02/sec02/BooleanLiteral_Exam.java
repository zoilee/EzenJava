package chpt02.sec02;

public class BooleanLiteral_Exam {
	
	
	public static void main(String[] args) {
		
		int x= 10;
		boolean result1 = (x == 20);
		System.out.println(result1);
		
		boolean result2 = (x != 20);
		
		boolean result3 = (x > 20);
		
		boolean result4 = (0<x && x <20);
		
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		
		//y ������ 30�� ���� ������ y�� 20���� ������ "�����մϴ�."��� ũ�� ���ų� ũ�� "y�� ���� 30 �Դϴ�."�� ���

		int y= 30;
		boolean res1 = (y < 20);
		boolean res2 = (y > 20 && y == 30);
		
		if(y < 20) {
			System.out.println("�����մϴ�.");
		}else {
			System.out.println("y�� ����" + y + "�Դϴ�");}
		}
		
	}

