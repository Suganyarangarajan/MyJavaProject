package practice;

public class Constructor {
	int mark2;
	
	public Constructor(int mark1)
	{
		mark2 = mark1;
	}

	public static void main(String[] args) {
		
      Constructor m1 = new Constructor(23);
      
      System.out.println("Mark is"+m1.mark2);
      
    
      
	}

}
