package chpt07.sec08;

public class Animal_Exam {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		//������ overriding �� �޼ҵ� ���
		dog.sound();
		cat.sound();
		
		//animal�� ������ �ִ� �޼ҵ带 ��ӹ޾� ���
		dog.breathe();
		cat.breathe();
		
		animalSound(cat);
		animalSound(dog);

	
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
