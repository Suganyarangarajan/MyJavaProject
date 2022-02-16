package practice;

public class Hospital_Management {
	// Hospital details goes here

	public static void main(String[] args) {
		
		/*
		  java program for developing hospital application
		 */
		
    String HospitalName = "ABC";		
    String DocSpecialization = "physician";
    
    String PatientName = "DEF";
    String PatientMedHistory = "QRSTUVWXYZ";
    int PatientAge = 30;
    float PatientHBCount = 15.2f;
    char PatientGender = 'F';
    boolean PositiveLabResult = true;
    boolean NegativeLabResult = false;
    long PatBillAmt = 1000000;
    
    
    System.out.println("The Hospital name is          :- "+HospitalName);
    System.out.println("The Doctor name is            :- "+"Mr/Ms."  +HospitalName);
    System.out.println("The Doctor specialization is  :- "+DocSpecialization);
    
    System.out.println("The Patient name is           :-" +"Mr/Ms. "+PatientName);
    System.out.println("The Patient age is            :- "+PatientAge);
    System.out.println("The Patient gender is         :- "+PatientGender);
    System.out.println("The Patient HB count is       :- "+PatientHBCount);
    System.out.println("The Patient medical history is:- "+PatientMedHistory);
    System.out.println("The lab result for DEF is     :- "+PositiveLabResult);
    System.out.println("The Total amount is           :- "+PatBillAmt);

	}

}
