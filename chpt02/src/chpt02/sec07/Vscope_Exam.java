package chpt02.sec07;

public class Vscope_Exam {

	public static void main(String[] args) {

		int var1 = 100;
		int var2, var3=0 ,  var4 = 0;
		if(true) {
			var2 = 300;
			
		}
		for(int i= 0; i <10; i++) {
			if(i == 0) {
				var3 = 400;
				;
			} else {
				var4 = 500;
				;
			}						
		}
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		//System �ý������� out ��� print //ln�ٹٲ�
		//print() println() prinf("���Ĺ��ڿ�", ��1, ��2 ....);
		//���ڿ� Ÿ�� %s, ���ڿ� Ÿ�� %d(����), %f(�Ǽ�)
		String name = "ȫ�浿";
		int age = 30;
		
		System.out.printf("�̸� : %s , ����: %d", name, age);

	}
}
