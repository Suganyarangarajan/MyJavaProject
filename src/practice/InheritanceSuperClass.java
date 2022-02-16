package practice;

class InheritanceSuperClass 
{
	protected int x=10;
public void supermethod()
{
	System.out.println("This is Super class");
	}
}

class InheritanceSubClass extends InheritanceSuperClass
{
	protected int y = 20;
	public void submethod()
	{
	System.out.println("This is SubClass");
}
}


