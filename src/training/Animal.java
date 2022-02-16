package training;

abstract class Animal {
	abstract void animalSound();
	public void sleep() {
		System.out.println("Zooooo Zooooo");
	}

}

class Dog extends Animal {
	public void animalSound() {
		System.out.println("Dog barks : bow bow ");
	}
}

class Cat extends Animal {
	public void animalSound() {
		System.out.println("Cat says: Meow Mewo");
	}
}