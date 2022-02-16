package practice;

public class Arrays {
	
	    public static void main(String[] args)
	    {
	        String names[] = { "Rajesh", "Sarvesh", "Ramesh", "Rakesh", "Vignesh" };
	        int marks[] = { 45, 78, 83, 77, 93 };
	        char sections[] = { 'A', 'B', 'A', 'A', 'B' };
	        
	        
	        for(int i = 0; i < names.length; i++)
	        {
	            System.out.println( names[i] + " in section " + sections[i] + " got " + marks[i] + " marks." );
	        
	         if(marks[i]>80)
	        {
	        	System.out.println( names[i]+ " is Excellent Student");
	        }else if(marks[i]>70)
	        {
	        	System.out.println(names[i]+ " is Good Student");
	        }else  {
	        	System.out.println(names[i]+ " is Poor Student");
	        	
	        }}
	    }
	}


	
		
		/*String furniture[] = {"sofa","table","chair"};
		for(String name: furniture)
		{
			System.out.println(name);


		}}*/

