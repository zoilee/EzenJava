package chpt02.sec07;

public class Printf_Exam {

	public static void main(String[] args) {
		/*
		 *���� %d 
		 *%6d ____30 -- 6�ڸ��� ���õǰ� �������� ���ڸ��� ������ �ȴ�.
		 *%-6�� 30____ -- ���������� ���ڸ��� ������ �ȴ�.
		 *%06d -- ���ڸ��� 0���� ä����
		 *�Ǽ� %f
		 *%10.2f -- ������ 7�ڸ� . �Ҽ��� ���ϰ� 2�ڸ� (���ʰ���)
		 *%-10.2f --- �����ʰ���
		 *\t ��(tab) \n �ٹٲ� %% %
		 */
		
		int var = 123;
		System.out.printf("��ǰ�� ����: %d��\n", var);
		System.out.printf("��ǰ�� ����: %6d��\n", var);
		System.out.printf("��ǰ�� ����: %-6d��\n", var);
		System.out.printf("��ǰ�� ����: %06d��\n", var);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("������ %d�� ���� ���̴� %10.2f\n", 10, area);
		
		String name="ȫ�浿";
		String job="���ϳ�";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}

}
