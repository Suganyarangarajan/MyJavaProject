package practice;

public class SwitchStatement {

	public static void main(String[] args) {
		char grade = 'D';
    switch(grade)
    {
    	case 'A' :
    		System.out.println("Student mark is greater than 90");
    		break;
    	case 'B' :
    		System.out.println("Student mark is greater than 80 and less than 90");
    		break;
    	case 'C' :
    		System.out.println("Student mark is greater than 70 and less than 80");
    		break;
    	case 'D' :
    		System.out.println("Student mark is greater than 60 and less than 70");
    		break;
    	case 'E' :
    		System.out.println("Student mark is greater than 50 and less than 60");
    		break;
    	case 'F' :
            System.out.println("Student mark is less than 50");
            break;
        default:
            System.out.println("Invalid Grade");
    }
	}
}