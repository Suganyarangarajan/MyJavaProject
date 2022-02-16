package practice;
import java.util.Scanner;

public class StudentRecord {

	public static void main(String[] args) {
		int rollno,maths,physics,chemistry;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		name = sc.nextLine();
		System.out.println("Enter Roll number");
		rollno = sc.nextInt();
		System.out.println("Enter Marks");
		maths = sc.nextInt();
		physics = sc.nextInt();
		chemistry = sc.nextInt();
		int total = maths+physics+chemistry;
		int percentage = total/3;
		System.out.println("Roll number is" +""+rollno+""+ "\t Name"  +name);
		System.out.println("Marks"+ maths +"\t Physics"+ physics +"\tChemistry"+chemistry);
	    System.out.println("Total:" +total+ "\tsuPercentage:" +percentage);	
	
		if(total>200)
		{
			System.out.println("The Mark is good");
		}else if(total>100){
			System.out.println("poor marks");
		
		}

	}
}
	

	
