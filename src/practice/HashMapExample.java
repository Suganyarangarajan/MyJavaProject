package practice;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String,String> meaningopposites = new HashMap<String,String>();
		meaningopposites.put("Good","Bad");
		meaningopposites.put("Neat","Messy");
		meaningopposites.put("Bright","Dark");
		meaningopposites.put("Day","Night");
		System.out.println(meaningopposites);
        
        System.out.println(meaningopposites.get("Day"));
        System.out.println(meaningopposites.remove("Good"));
	}

}
