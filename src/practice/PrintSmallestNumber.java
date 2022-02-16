package practice;

public class PrintSmallestNumber {

	public static void main(String[] args) 
	{
		
		int [] array = new int [] {10,20,30,40,50,60};
		int min = array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<min)
				min= array[i];
		}
				System.out.println("Smallest Number is"+min);
				
				

	}

}
