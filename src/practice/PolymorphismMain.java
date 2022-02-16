package practice;

class PolymorphismMain {
public void brand()
{
	System.out.println("Main Brand");
}
	public static void main(String[] args) {
		
		Polymorphism vh2 = new Polymorphism();
		vehicle1 vh1 = new vehicle1();
		PolymorphismMain vh3 = new PolymorphismMain();
		vh1.brand();
		vh2.brand();
		vh3.brand();

	}

}
