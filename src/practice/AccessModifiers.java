package practice;

public class AccessModifiers {
public int x = 10;  //public variable
private int y = 20; // private variable

final int z = 30; // final variable

public static void method()  //static methods doesn't need to create objects
{
	System.out.println("Static Methods goes here ");
}

	public static void main(String[] args) {
		AccessModifiers acs = new AccessModifiers();
		int z = 40;
		
		System.out.println("The value of X is "+acs.x);
		System.out.println("The value of Y is "+acs.y);
		System.out.println("The value of Z is "+acs.z);
		acs.method();
		
	}

}
