package training;

public class AnimalMain {

	public static void main(String[] args) {
		
		Dog dogObj = new Dog();
		Cat catObj = new Cat();
		
		dogObj.animalSound();
		dogObj.sleep();
		
		catObj.animalSound();
		catObj.sleep();

	}

}
