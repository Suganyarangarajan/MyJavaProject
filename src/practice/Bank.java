package practice;

public class Bank {
public void getpercentageofInterest()
{
	System.out.println("Rate of Interest");
	}
}
class Bank1 extends Bank 
{
	public void getpercentageofInterest()
	{
		System.out.println("Rate of Interest for Bank1 is 8 %");
	}
}
class Bank2 extends Bank
{
	public void getpercentageofInterest()
	{
		System.out.println("Rate of Interest for Bank2 is 6 %");
	}
}
class Bank3 extends Bank
{
	public void getpercentageofInterest()
	{
		System.out.println("Rate of Interest for Bank3 is 4 %");
	}
}