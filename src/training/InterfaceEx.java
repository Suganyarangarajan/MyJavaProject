package training;

interface InterfaceEx {

	public void Laptop();
	public void Keyboard();
}

class Sales implements InterfaceEx {
	public void Laptop() {
		System.out.println("Dell HP Sony Apple Mac");
	}
	public void Keyboard() {
		System.out.println("Keyboard Model Compatible");
	}
}