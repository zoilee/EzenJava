package chpt05.sec01;

public class GarbageObject_Exam {

	public static void main(String[] args) {
		
		String hobby = "����";
		hobby = null;  //"����"�� �ش��ϴ� String ��ü�� ������� ����
		
		String kind1= "�ڵ���";
		String kind2= kind1;
		kind1 = null; //"�ڵ���"��ü�� �����Ⱑ �ƴ� kind2�� ���� ����
		System.out.println(kind2);

	}

}
