package chpt13.sec02;

public class GenericT_Exam {
	
	//���׸� �޼ҵ�
	public static <T> Box<T> boxing(T t){
		
		//���׸� �޼ҵ�
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;
	}
	
	public static void main(String[] args) {
		
		//���׸� �޼ҵ� ȣ��
		Box<Integer> box1 = boxing(100);
		int intVal = box1.getT();
		System.out.println(intVal);
		
		Box<String> box2 = boxing("��ö��");
		String strVal = box2.getT();
		System.out.println(strVal);
	}

}
