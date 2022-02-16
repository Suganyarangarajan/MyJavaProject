package training;

import java.time.*;


public class DateTimeExample {

	public static void main(String[] args) {
		
		LocalDate dObj = LocalDate.now();
		System.out.println(dObj);
		LocalTime tObj = LocalTime.now();
		System.out.println(tObj);
		LocalDateTime dtObj = LocalDateTime.now();
		System.out.println(dtObj);
	}

}
