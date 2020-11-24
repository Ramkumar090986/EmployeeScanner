package org.employeescanner;

import java.util.Scanner;

public class EmployeeScanner {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		Scanner s3=new Scanner(System.in);
		System.out.println("Enter the EmployeeID:");
		int empId=s1.nextInt();
		System.out.println("Enter the Employee Name:");
		String name=s2.nextLine();
		System.out.println("Enter the Email");
		String email=s2.nextLine();
		System.out.println("Enter the Phone no:");
		long phoneNo=s1.nextLong();
	    System.out.println("Enter the Salary:");
	    float salary=s1.nextFloat();
	    System.out.println("Enter the Gender:");
	    char c1=s3.next().charAt(0);
	    System.out.println("Enter the City:");
	    String city=s2.nextLine();
	    System.out.println("Employee ID:"+empId);
	    System.out.println("Employee Name:"+name);
	    System.out.println("Email:"+email);
	    System.out.println("Phone no:"+phoneNo);
	    System.out.println("Salary:"+salary);
	    System.out.println("Gender:"+c1);
	    System.out.println("City:"+city);
	    System.out.println("Employee Details");
		
		
		
	}

}
