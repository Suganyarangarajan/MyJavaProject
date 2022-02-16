package practice;

interface MultipleInterface1 {
	public void method1();
}

	interface MultipleInterface2 {
	public void method2();
	}

class Demo implements MultipleInterface1,MultipleInterface2
{
	public void method2()
	{
		System.out.println("Method 2 content goes here");
	}
	public void method1()
	{
		System.out.println("Method 1 Content goes here");
	}
}