package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
	
	/*
	Final Class: Cannot be inherited
	Final Method: Cannot be overridden
	Abstract Class: Cannot be instantiated
	Abstract Method: Cannot be implemented	
	Util Class: Use final class and private constructor
	*/

	public static void main(String[] args) {		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced? (y/n) ");
			char decision = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();			
			if(decision == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));				
			} else {
				employees.add(new Employee(name, hours, valuePerHour));				
			}			
			System.out.println();			
		}
		
		System.out.println("PAYMENTS:");
		for(Employee employee : employees) {
			System.out.println(employee.getName() + " - $" + String.format("%.2f", employee.payment()));
		}
		
		sc.close();
	}
}
