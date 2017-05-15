package com.Exam;

import java.io.IOException;
import java.util.Scanner;

import com.emp.Employee;
import com.emp.ExamBooking;
import com.emp.ExamDetails;
import com.emp.InvalidInputException;

public class EmpExam {

	public static void main(String[] args) throws InvalidInputException, IOException {
		
		ExamBooking eb = new ExamBooking();
		ExamDetails ed = new ExamDetails();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Exam Code: ");
		String num = scan.next();
		//eb.searchExam(num);
		
		System.out.println("********************************");
		System.out.println("Enter Employee Name: ");
		String empName = scan.next();
		System.out.println("Enter Employee Department:" );
		String empDept = scan.next();
		Employee e= new Employee(empName, empDept);
		eb.addBooking(empName, num );
		
		
	
		System.out.println("********************************");
		
		System.out.println("\t\t\t\tExam Booking Details");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Employee Id\t\t\tEmployee Name\t\tExam Code\t\tFees");
		eb.examBooking();
	}
}
