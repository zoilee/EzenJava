package chpt07.sec08;

public class Animal_Exam {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		//본인이 overriding 한 메소드 사용
		dog.sound();
		cat.sound();
		
		//animal이 가지고 있는 메소드를 상속받아 사용
		dog.breathe();
		cat.breathe();
		
		animalSound(cat);
		animalSound(dog);

	
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
