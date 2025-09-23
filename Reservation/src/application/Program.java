package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Caveat;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("(dd/MM/yyyy)");
		Scanner sc = new Scanner(System.in);
		 sdf.setLenient(false);
		
		
		System.out.print("Room Number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkin = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		if(! checkOut.after(checkin)) {
			System.out.println("Error in reservation: Check-out date must after check-in date");
		}
		else {
			Caveat reserv = new Caveat(number, checkin, checkOut);
			System.out.print("reservation: " + reserv);
			
			System.out.println();
			System.out.println("Enter data to update the reservation");
			System.out.print("check-in data (dd/MM/yyyy): ");
			checkin = sdf.parse(sc.next());
			System.out.print("check-out data (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			reserv.updateDates(checkin, checkOut);
			System.out.print("reservation: " + reserv);
		}


	}

}
