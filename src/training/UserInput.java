package training;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username");
	    
	    String userName = myObj.nextLine();  // Read user input
	    System.out.println("Enter Salary :");
	    double salary = myObj.nextDouble();
	    System.out.println("Username is: " + userName);  // Output user input
	    System.out.println("Salary is : " +salary);
	


	}

}
