package practice;

import java.util.ArrayList;

public class ArrayListexample1 {

	public static void main(String[] args) {
		ArrayList<String> furniture = new ArrayList<String>();
		furniture.add("Sofa");
		furniture.add("Bed");
		furniture.add("Chair");
		furniture.add("Table");
		System.out.println(furniture);
		furniture.set(1, "Swing");
		
		System.out.println(furniture.get(1));
		System.out.println(furniture);

	}

}
