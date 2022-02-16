package practice;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> brand = new LinkedList<String>();
		brand.add("HP");
		brand.add("Sony");
		brand.add("Dell");
		brand.add("Apple");
		brand.add("Lenovo");
		System.out.println(brand);
			brand.addFirst("Acer");
			brand.addLast("Samsung");
			System.out.println(brand);
            System.out.println(brand.getFirst());
            System.out.println(brand.getLast());
	}

}
