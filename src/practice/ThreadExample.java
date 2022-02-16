package practice;

public class  ThreadExample extends Thread 
{
	
	public static int amount = 1000;

	public static void main(String[] args)
	{
		ThreadExample thr = new ThreadExample();
		thr.start();
		while(thr.isAlive())
		{
			System.out.println("Waiting");
		}
		System.out.println(" Main 1:  "+amount);
		amount++;
		System.out.println(" Main 2:  "+amount);

	}
public void run()
{
	amount++;
}
}
