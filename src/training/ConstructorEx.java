package training;

public class ConstructorEx {

	int salary;
	
	public ConstructorEx(int sal) {
		salary = sal;
	}
	
	public static void main(String[] args) {
		ConstructorEx myObj = new ConstructorEx(8000);
		System.out.println(myObj.salary);

	}

}
