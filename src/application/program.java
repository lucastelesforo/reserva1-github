package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.reservartion;

public class program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {

			System.out.print("Room Number: ");
			int number = sc.nextInt();

			System.out.print("Check-in date(dd/MM/yyyy):");
			Date CheckIn = sdf.parse(sc.next());

			System.out.print("Check-out date(dd/MM/yyyy):");
			Date CheckOut = sdf.parse(sc.next());


			reservartion Reservartion = new reservartion(number, CheckIn, CheckOut);
			System.out.println("Reservation" + Reservartion);

			System.out.println();
			System.out.println("Entre com nova data,atualizar  reserva:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			CheckIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			CheckOut = sdf.parse(sc.next());

			Reservartion.updateDates(CheckIn, CheckOut);
			System.out.println("Reservation" + Reservartion);
		} 
		catch (ParseException e) {
			System.out.println("formatação data invalida:");
		} 
		catch (IllegalArgumentException e) {
			System.out.println("Erro na reserva:" + e.getMessage());
		}

		sc.close();
	}

}
