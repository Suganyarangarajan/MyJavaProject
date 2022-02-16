package practice;

public class NonstaticMethod {

	public static void main(String[] args) {
	
     Computer c1 = new Computer();
     c1.ProcessorCount();
     c1.RamCapacity(128);
     c1.HarddiskCapacity(32);
     
     c1.x = 300;
     System.out.println(c1.x);
	}
	

}
