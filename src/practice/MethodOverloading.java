package practice;

public class MethodOverloading {
	
	static int getMethod(int x,int y)
	{
	return x + y;
	}
    static double getMethod(double x,double y)
    {
	return x * y;
    }
    
    static void getArea(int l,int b)
    {
    System.out.println("Area of rectangle is" +" "+(l*b));	
    }
    static void getArea(float l,float b,float h)
    {
	System.out.println("Area of triangle is" +" "+((b*h)/2));
    }

	public static void main(String[] args) 
	{
	
    int a = getMethod(8,10);
    double b = getMethod(3.45,98.34);
    
    System.out.println(a);
    System.out.println(b);
    
    getArea(10,20);
    getArea(23.89f,98.9f,67.9f);
   

	}

}
 