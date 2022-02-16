package practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;


public class Package 
{

public static void main(String[] args) 
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter the Name");
String name = sc.nextLine();
System.out.println("The Name is "+name);
LocalDate obj = LocalDate.now();
LocalDateTime dobj = LocalDateTime.now();
StringBuffer sbr = new StringBuffer(name);
System.out.println(dobj);
System.out.println(obj);
sbr.reverse();
System.out.println("The Reversed String is  "+sbr);
	}

}
