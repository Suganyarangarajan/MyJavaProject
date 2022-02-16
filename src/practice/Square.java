package practice;

interface Square {
	public int area(int sides);
	public int perimeter(int sides);
}

class Square1 implements Square
{
	public int area(int sides)
	{
		return sides*sides;
	}
	public int perimeter(int sides)
	{
		return 4*sides;
	}
}

