package chpt06.sec04;

public class Car1_Exam {

	public static void main(String[] args) {
		//��ü����
		Car1 myCar = new Car1();
		
		myCar.setGas(10);
		if(myCar.viewgas()) {
			System.out.println("����ؿ�.");
			
			//run()�޼ҵ� ȣ��
			myCar.run();
		}
		System.out.println("gas�� ������ �ּ���.");
	}

}
