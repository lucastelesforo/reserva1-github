package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.reservartion;

public class program {

	public static void main(String[] args) throws ParseException {
		
	
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room Number: ");
		int number = sc.nextInt();
		
		System.out.print("Check-in date(dd/MM/yyyy):");
		Date  checkIn =sdf.parse(sc.next());
		
		System.out.print("Check-out date(dd/MM/yyyy):");
		Date  checkOut =sdf.parse(sc.next());
		
		if(!checkOut.after(checkIn)) {
			System.out.println("Erro reserva, data de check-out tem que ser depois do chek-in:");
		}
		else {
			reservartion Reservartion = new reservartion(number,checkIn, checkOut);
			System.out.println("Reservation"+Reservartion );
			
			System.out.println();
			System.out.println("Entre com nova data update da reserva:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn=sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut= sdf.parse(sc.next());
			
			Reservartion.updateDates(checkIn,c)
			
		}
		
		
		
sc.close();
	}

}
