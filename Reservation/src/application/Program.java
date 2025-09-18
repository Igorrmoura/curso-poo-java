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
		
		
		System.out.print("Room Number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		if(! checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must after check-in date");
		}
		else {
			Caveat reserv = new Caveat(number, checkIn, checkOut);
			System.out.print("reservation: " + reserv);
		}


	}

}
