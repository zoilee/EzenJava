package chpt11.sec03;

public class Account_Exam {

	public static void main(String[] args) {
		Account acc = new Account();
		//�����ϱ�
		acc.deposit(100000);
		System.out.println("���ݾ� : " + acc.getBalance());
		
		//����ϱ�
		
		try {
			acc.withDraw(1000000);
		} catch (minusException e) {
			
			String message = e.getMessage();
			System.out.println(message);
		}

	}

}
