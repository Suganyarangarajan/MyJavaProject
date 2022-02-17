package practice;

public class HospitalDetails {
	
	public void getpatientDetails()
	{
    int patientId = 123;
    String patientName = "ABC";
    int age = 30;
    System.out.println("patient details goes here");
    System.out.println("Patient ID is  "+patientId);
    System.out.println("Patient Name is  "+patientName);
    System.out.println("Patient Age is  "+age);
	}
	public void getdoctorDetails()
	{
		int doctorId = 567;
		String doctorName = "LMN";
		String specialization = "Dentist";
		System.out.println("Doctor ID is  "+doctorId);
	    System.out.println("Doctor Name is  "+doctorName);
	    System.out.println("Doctor Specialization is  "+specialization);
	    		
		
	}
	public void gethospitalDetails()
	{
	String hospitalName = "JKL";
	int totalamount = 10000;
	
	System.out.println("Hospital Name is  "+hospitalName);
    System.out.println("Total amount is  "+totalamount);
    
	}
	public static void main(String[] args) {
		HospitalDetails hp1 = new HospitalDetails();
		HospitalDetails hp2 = new HospitalDetails();
		HospitalDetails hp3 = new HospitalDetails();
		hp1.getdoctorDetails();
		hp2.gethospitalDetails();
		hp3.getpatientDetails();

	}

}
