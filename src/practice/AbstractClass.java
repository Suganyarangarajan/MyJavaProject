package practice;

abstract class Vehicle {

	public abstract void speed();
	public void gear()
	{
		System.out.println("Vehicle stops here");
	}
}
class car extends Vehicle
{
	public void speed()
	{
		System.out.println("Speed can be controlled here");
	}

}
