package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {
	
	/*
	Checked Exception: A predictable scenario. The application should anticipate and recover from it. Ex: Wrong input, request a new input (or at least show the error)
	Unchecked Exception: An unpredictable scenario. It is not necessary to recover from it, as it generally is a problem on the code. It is better to eliminate the bug. Ex: A logic error
	
	An exception only terminates the program if it is an uncatched unchecked exception OR it is catched at the end of the main function (as the program reaches its end)
	
	Q: Why is the entire main function inside the try, and not just the part that can cause the exception?
	
	A: Because the exception is not really recovered from. You just get a message. If only the exception part was in the try, the program would continue even with errors.
	You would have to really recover from this problem to do this (like prompting for new input). As only a message is shown, the entire main function is in the try because,
	when a catch occurs, all the remaining try code is ignored. So, if any exception occurs, none of the remaining main code is ran, and the program ends.
	
	Q: Why can you declare throws of a RuntimeException and, even then, it doesn't need to be recovered from?
	
	A: One possibility is that this was not planned in the initial development of the exception API and, if it changed, it could break currently working programs.
	*/
	
	public static void main(String[] args) {		

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");		
		
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
			System.out.println();
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println(reservation);
			System.out.println();
			
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			System.out.println();
			
			reservation.updateDates(checkIn, checkOut);		
			System.out.println(reservation);
		}
		catch(ParseException e) {
			System.out.println("Invalid date format");			
		}
		catch(DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}	
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
		sc.close();
	}
}
