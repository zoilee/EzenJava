package chpt06.sec06;

public class Korean_Exam {

	public static void main(String[] args) {
		//��ü ���� �����ڿ� �ֹι�ȣ�� �̸��� ����, �ֹι�ȣ�� �ٽ� ���� �Ұ���
		Korean k1 = new Korean("123456-123456","ȫ�浿");
		
		//�ʵ尪 �ϱ�
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		//�ʵ尪 ����
//		k1.nation = "�̱�";
//		k1.ssn = "123412-124125";
		k1.name= "ȫ���";

	}

}
