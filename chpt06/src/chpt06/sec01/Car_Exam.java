package chpt06.sec01;

public class Car_Exam {

	public static void main(String[] args) {
		
		
		//Car Ŭ������ �̿��� ��ü�� ����
		Car myCar1 = new Car();
		Car myCar2 = new Car("����");
		Car myCar3 = new Car("����", "���׽ý�");
		Car myCar = new Car("����", "���׽ý�", "���");
		
		//Car ��ü�� �ʵ尪

		System.out.println("ȸ��� : " + myCar.company);
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("���� : " + myCar.color);
		System.out.println("�ְ�ӵ� : " + myCar.Maxspeed);
		System.out.println("����ӵ� : " + myCar.speed);
		
		//car Ŭ������ �ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ ����ӵ� : " + myCar.speed);
		
		System.out.println("ȸ��� : " + myCar1.company);
		System.out.println("�𵨸� : " + myCar1.model);
		System.out.println("���� : " + myCar1.color);
		System.out.println("�ְ�ӵ� : " + myCar1.Maxspeed);
		System.out.println("����ӵ� : " + myCar1.speed);
		System.out.println("ȸ��� : " + myCar2.company);
		System.out.println("�𵨸� : " + myCar2.model);
		System.out.println("���� : " + myCar2.color);
		System.out.println("�ְ�ӵ� : " + myCar2.Maxspeed);
		System.out.println("����ӵ� : " + myCar2.speed);
		System.out.println("ȸ��� : " + myCar3.company);
		System.out.println("�𵨸� : " + myCar3.model);
		System.out.println("���� : " + myCar3.color);
		System.out.println("�ְ�ӵ� : " + myCar3.Maxspeed);
		System.out.println("����ӵ� : " + myCar3.speed);
		
	}

}
