package chpt02.sec07;

public class NewCasting_Exam {

	public static void main(String[] args) {
		
		//�Ǽ� ������ ����� double ���� int - �⺻ Ÿ������ �޴´�.

		byte rs1 = 10 + 20; //������ �ܰ迡�� �̸� ����� �Ǿ� ����� ���
		System.out.println(rs1);
		
		byte v1 = 10;
		byte v2 = 20;
		int rs2 = v1 + v2;  //intŸ������ ��ȯ �� ����
		System.out.println(rs2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long rs3 = v3 + v4 + v5; //���� ū Ÿ���� ling���� ��ȯ
		System.out.println(rs3);
		
		char v6 = 'A';
		char v7 = 1;
		int rs4 = v6 + v7;
		System.out.println(rs4);
		System.out.println((char)rs4);
		
		int v8 = 10;
		int rs5 = v8 / 4;  //���� ������ ����� ����
		double rs6 = (double) v8 / 4; //���������� ����� �Ǽ��� �������� �Ǽ�Ÿ������ ��ȯ�ؾ� �Ѵ�.
		System.out.println(rs6);
		
		char a = 'A';
		char b = 'B';
		int rs = a + b;
		System.out.println(rs);
		
		String rss = 3 + "7";
	
	}

}
