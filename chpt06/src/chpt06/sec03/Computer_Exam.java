package chpt06.sec03;

public class Computer_Exam {

	public static void main(String[] args) {
		Computer myCom1 = new Computer();
		
		int rs1 = myCom1.sum(1,2,3);
		int rs2 = myCom1.sum(1,2,3,4,5);
		System.out.println("��°���� "+rs1+","+ rs2);
		
		
		int[] val = {1,2,3,4,5,6,7};
		int rs3 = myCom1.sum(val);
		System.out.println("rs3 : " + rs3);
		
		int rs4 = myCom1.sum2(val);
		System.out.println("��°���� "+rs4);
		
		//�Ű������� �迭�� ���� �Ϸ��� new �̿��ؾ��Ѵ�.
		int rs5 = myCom1.sum2(new int[]{1,2,3,4,5,});
		System.out.println("��°���� "+rs5);
	}

}