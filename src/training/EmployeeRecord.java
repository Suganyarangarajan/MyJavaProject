package training;

public class EmployeeRecord {

	public static void main(String[] args) {
		String emp_fname = "Suganya";
		String emp_lname = "Rangarajan";
		int emp_ID = 12345;
		int salary = 10000;
		int tax = 100;
		int incentive = 1000;
		int insurance= 500;
		int total_salary= salary+incentive-tax-insurance;
		
		System.out.println("Employee Name is:"+ emp_fname + emp_lname);
		System.out.println("Employee ID is:"+emp_ID);
		System.out.println("Employee salary is:"+salary);
		System.out.println("Employee total salary is:"+total_salary);
		

	}

}
