package practice;

public class Enum {

	enum sizes{
		  SMALL,
		  REGULAR,
		  LARGE
		}

		
		  public static void main(String[] args) {
		    sizes var = sizes.SMALL;

		    switch(var) {
		      case SMALL:
		        System.out.println("Small Size");
		        break;
		      case REGULAR:
		         System.out.println("Regular Size");
		        break;
		      case LARGE:
		        System.out.println("Large Size");
		        break;
		    }
		  }
		}
