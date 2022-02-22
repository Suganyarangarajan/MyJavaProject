package practice;

public class Exceptionhandling {

	public static void main(String[] args) {
		try
		{
			int num = 20/0;
			System.out.println(num);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handling in catch block");
			System.out.println("Exceptions will be catched here");
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block will gets executed always");
		}

	}

}
