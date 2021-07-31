package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();		
		System.out.println();
		
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Level: ");
		WorkerLevel level = WorkerLevel.valueOf(sc.next());
		System.out.print("Base salary: ");
		double salary = sc.nextDouble();		
		Worker worker = new Worker(name, level, salary, new Department(departmentName));
		System.out.println();
		
		System.out.print("How many contracts to this worker? ");
		int contractNumber = sc.nextInt();
		System.out.println();
		
		for(int i = 1; i <= contractNumber; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date date = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();			
			worker.addContract(new HourContract(date, valuePerHour, hours));
			System.out.println();
		}		
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		String[] parts = monthAndYear.split("/");
		int month = Integer.parseInt(parts[0]);
		int year = Integer.parseInt(parts[1]);		
		
		System.out.println("Name: " + worker.getName());		
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(month, year)));
		
		sc.close();
	}
}
