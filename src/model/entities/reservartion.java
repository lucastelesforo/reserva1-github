package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class reservartion {

	private Integer roomnumber;
	private Date CheckIn;
	private Date CheckOut;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public reservartion(Integer roomnumber, Date checkIn, Date checkOut) {

		this.roomnumber = roomnumber;
		this.CheckIn = checkIn;
		this.CheckOut = checkOut;
	}

	public Integer getRoomnumber() {
		return roomnumber;
	}

	public void setRoomnumber(Integer roomnumber) {
		this.roomnumber = roomnumber;
	}

	public Date getCheckIn() {
		return CheckIn;
	}

	public Date getCheckOut() {
		return CheckOut;
	}

	public long duration() {
		long diff = CheckOut.getTime() - CheckIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	public void updateDates(Date CheckIn, Date CheckOut) {
		Date now = new Date();
		if (CheckIn.before(now) || CheckOut.before(now)) {
		throw new IllegalArgumentException( "Erro na reserva, Data de atualização deve ser futura");
		}
		if (!CheckOut.after(CheckIn)) {
			throw new IllegalArgumentException( "Erro reserva, data de check-out tem que ser depois do chek-in:");

		}
		this.CheckIn = CheckIn;
		this.CheckOut = CheckOut;
	

	}

	@Override
	public String toString() {
		return " Room " 
				+ roomnumber 
				+ ", Check-In:"
				+ sdf.format(CheckIn)
				+ ", Check-Out:"
				+ sdf.format(CheckOut)
				+ ", " 
				+ duration()
				+ " nights";
	}

}
