package practice;

public class ThreadEg implements Runnable
{
	 
		  public static void main(String[] args) 
		  {
		    ThreadEg obj = new ThreadEg();
		    Thread thread = new Thread(obj);
		    thread.start(); //github integration
		    System.out.println("This code is outside of the thread");
		    System.out.println("Integration seccussful for github");
		  }
		  public void run() 
		  {
		    System.out.println("This code is running in the thread");
		  }
		}


