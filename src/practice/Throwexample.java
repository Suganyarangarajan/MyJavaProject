package practice;

public class Throwexample {
	
static void eligibility(int age)
{
if(age<12)
{
	throw new ArithmeticException("You are not eligible for registration");
}
else
{
	System.out.println("You can start registration");
}
}
	public static void main(String[] args) {
		eligibility(13);

	}

}
