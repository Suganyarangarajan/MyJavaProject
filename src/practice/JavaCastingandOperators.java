package practice;

public class JavaCastingandOperators {

	public static void main(String[] args) {
		int var1 = 10;
		double var2 = var1;
		//typecasting from int to double - widening 
		System.out.println(var2);
		double d1 = 19.78;
		int i1 = (int) d1;
		//narrowing 
		System.out.println(i1);
		
		System.out.println(d1>var1);
		
		//assignment operators
		int x= 30, y= 10;
		x<<=3;
		System.out.println(x);
		x+=5;
		System.out.println("Addition  :- " +  x);
		x-=10;
	    System.out.println("Subtraction  :- " +  x);	
	    x*=2;
	    System.out.println("Multiplication  :- " +  x);
	    x/=10;
	    System.out.println("Division  :- " +  x);
	    x%=2;
	    System.out.println("Modulus Division  :- " +  x);
	    x^=2;
	    System.out.println("Power  :- " +  x);
	    int i=10,j=20;
	    System.out.println(i<5 && j<10);//logical AND
	    System.out.println(i<5 || j<10);// logical OR
	    System.out.println(!(i<5 && j<10)); // logical NOT
	    
		
 		

	}

}
