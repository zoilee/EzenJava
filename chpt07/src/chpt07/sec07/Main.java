package chpt07.sec07;

public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Dog(); // �ڵ�Ÿ�Ժ�ȯ (��ĳ����)
		animal.sound(); //���� ��ϴ���
		
		
		//DogŸ������ ���� Ÿ�Ժ�ȯ (�ٿ�ĳ����)
		if(animal instanceof Dog) { //Ÿ��Ȯ��
			Dog dog = (Dog) animal; //����Ÿ�Ժ�ȯ
			dog.sound();
			dog.fetch();
		}
		
		Animal newanimal = new Animal();
		if(newanimal instanceof Dog) {
			Dog newdog = (Dog) newanimal;
			newdog.sound();
			newdog.fetch();
		}else {
			System.out.println("newanimal�� DogŸ������ ��ȯ�� �ȵǿ���");
		}
	}

}
