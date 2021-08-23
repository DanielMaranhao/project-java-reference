package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	// How to have reuse and contract: have an abstract class (reuse) implement an interface (contract)
	// Interface Comparable: to compare objects to each other
	// Default Methods: Methods with implementation in the interface	

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (DD/MM/YYYY): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();
		System.out.print("Number of installments: ");
		int months = sc.nextInt();
		System.out.println();

		Contract contract = new Contract(number, date, totalValue);
		ContractService service = new ContractService(new PaypalService());
		service.processContract(contract, months);

		System.out.println("Installments");
		for (Installment installment : contract.getInstallments()) {
			System.out.println(sdf.format(installment.getDueDate()) + " - " + String.format("%.2f", installment.getValue()));
		}

		sc.close();
	}
}
