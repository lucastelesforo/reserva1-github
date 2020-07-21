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
		Date  CheckIn =sdf.parse(sc.next());
		
		System.out.print("Check-out date(dd/MM/yyyy):");
		Date  CheckOut =sdf.parse(sc.next());
		
		if(!CheckOut.after(CheckIn)) {
			System.out.println("Erro reserva, data de check-out tem que ser depois do chek-in:");
		}
		else {
			reservartion Reservartion = new reservartion(number,CheckIn, CheckOut);
			System.out.println("Reservation"+Reservartion );
			
			System.out.println();
			System.out.println("Entre com nova data,atualizar  reserva:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			CheckIn=sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			CheckOut= sdf.parse(sc.next());
			
		
		String error =	Reservartion.updateDates(CheckIn,CheckOut);
		if(error!=null) {
			System.out.println("Error na Reserva:" + error);
		}
		else {
		System.out.println("Reservation"+Reservartion );
			
		}
		
		}
		
sc.close();
	}

}
