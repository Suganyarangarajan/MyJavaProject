package practice;

public class ArithmeticOperations {
	int x,y;
	
	public static int add(int x,int y)
	{
		return x+y;
		
		
	}
	public static int sub(int x,int y)
	{
		return x-y;
	
		
	}
	public static int multiply(int x,int y)
	{
		return x*y;
	}
	public static int division(int x,int y)
	{
		return x/y;
		
	}

	public static void main(String[] args) {
		
		ArithmeticOperations obJ1 = new ArithmeticOperations();
		ArithmeticOperations obJ2 = new ArithmeticOperations();
        ArithmeticOperations obJ3 = new ArithmeticOperations();
		ArithmeticOperations obJ4 = new ArithmeticOperations();
		int a= obJ1.add(10,10);
		int b= obJ2.sub(20,10);
		int c= obJ3.multiply(10,50);
		int d= obJ4.division(50,10);
		System.out.println("Addition of two numbers       :"+a);
		System.out.println("Subtraction of two numbers    :"+b);
		System.out.println("Multiplication of two numbers :"+c);
		System.out.println("Division of two numbers       :"+d);
		   
	}

}
