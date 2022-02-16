package practice;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> animals = new HashSet<String>();
		animals.add("Tiger");
		animals.add("Lion");
		animals.add("Elephant");
		animals.add("Deer");
		animals.add("Fox");
		
		System.out.println(animals);
		System.out.println(animals.contains("Tiger"));
		System.out.println(animals.remove("Zebra"));
		

	}

}
