package chpt07.sec05;

public class Child_Exam {

	public static void main(String[] args) {
		
		//�ڽİ�ü ����
		Child child = new Child();
		
		child.method1(); //
		child.method2();
		child.method3();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();
		// parent.method3(); �θ� ������ ���� �ʾ� ȣ�� �Ұ���
	}

}
