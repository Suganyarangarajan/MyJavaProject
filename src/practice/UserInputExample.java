package practice;
import java.util.Scanner;

public class UserInputExample {


	
	  public static void main(String[] args) {
	    Scanner Obj = new Scanner(System.in);
	    

	    System.out.println("Enter Employee name");

	    String Employeename = Obj.nextLine();
	    
	    System.out.println("Enter Employee ID");
	    int EmpID = Obj.nextInt();
	    System.out.println("Enter Employee age");
	    int age = Obj.nextInt();
	    System.out.println("Enter Employee Salary");
	    double salary = Obj.nextDouble();

	    System.out.println("Employee details are given below ");
	    System.out.println("Employee Name: " + Employeename);
	    System.out.println("Employee ID  : " + EmpID);
	    System.out.println("Employee age : " + age);
	    System.out.println("Salary       : " + salary);
	  }
	}






