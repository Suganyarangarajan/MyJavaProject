package practice;

public class ElseIfCondition {

	public static void main(String[] args) {
		int i=1000;
		
		if(i>=0 && i<=100)
			System.out.println("The value ranges between 0 and 100");
		
		else if(i>100 && i<=1000)
			System.out.println("The value ranges between 101 and 1000");
		
		else if(i>1000) 
		System.out.println("The value is greater than 1000");

	}

}
