package practice;

public class InnerOuterClass {

	public static void main(String[] args) 
	{
		OuterClass Outer1 = new OuterClass();
	    OuterClass.InnerClass Inner1 = Outer1.new InnerClass();
	    System.out.println(Outer1.name + Inner1.name1);
	  }
	

	

}
