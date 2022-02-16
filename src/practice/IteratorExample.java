package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<String> subject = new ArrayList<String>();
		subject.add("Physics");
		subject.add("Chemistry");
		subject.add("Maths");
		subject.add("Computer Science");
		
		Iterator str = subject.iterator();
		System.out.println("The Elements in this List are");
		while(str.hasNext())
		{
        System.out.println(str.next());
	}

}
	}
