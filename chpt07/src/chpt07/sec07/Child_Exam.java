package chpt07.sec07;

public class Child_Exam {

	public static void main(String[] args) {
		
		Parent parent = new Child();
		
		//parent Ÿ������ �ʵ� �޼��� ���
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/* �ڽĿ��� �ִ� �ʵ�� �޼���� ��� �Ұ�
		parent.field2 = "data2";
		parent.method3();
		*/
		Child child = (Child) parent;
		child.field1 = "data1";
		child.method1();
		child.method2();
		child.field2 = "data2";
		child.method3();
		
	}

}
