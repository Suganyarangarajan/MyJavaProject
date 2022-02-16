package practice;

public class GetterSetter {

	public static void main(String[] args) {
		Encapsulation emp = new Encapsulation();
		emp.setEmpID(789);
        emp.setEmpname("XYZ");
        emp.setEmpdesignation("DEF");
		System.out.println(emp.getEmpID());
		System.out.println(emp.getEmpname());
		System.out.println(emp.getEmpdesignation());
	
	}

}
