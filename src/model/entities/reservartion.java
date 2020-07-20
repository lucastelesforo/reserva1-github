package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class reservartion {

	 private Integer roomnumber;
	 private  Date CheckIn;
	 private Date CheckOut;
	
	 private static SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
	 
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
		long diff = CheckOut.getTime()-CheckIn.getTime();
		return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
		
	}
	
	
	public reservartion(Date checkIn, Date checkOut) {
	
		this.CheckIn = checkIn;
		this.CheckOut = checkOut;
	}
	@Override
	public String toString() {
		return " Room "
				+ roomnumber
				+ ", check-in:"
				+ sdf.format(CheckIn)
				+ ", check-out:"
				+ sdf.format(CheckOut)
				+ ", "
				+ duration()
				+ " nights";
	}

}
	 
	 
	 

