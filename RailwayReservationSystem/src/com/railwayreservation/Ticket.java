package com.railwayreservation;

import java.util.List;

public class Ticket {
	int pnr;
	String from;
	String to;
	int seats;
	boolean confirmed;
	List<Integer> seatNumbers;
	
	public Ticket(int pnr, String from, String to, int seats, boolean confirmed, List<Integer> seatNumbers) {
		this.pnr = pnr;
		this.from = from;
		this.to = to;
		this.seats = seats;
		this.confirmed = confirmed;
		this.seatNumbers = seatNumbers;
	}
	
	public String toString() {
		return String.format("PNR - %d \nFROM: %s \nTO: %s \nSEATS: %d \nSTATUS: %s", pnr, from, to, seats, confirmed ? "confirmed": "Waiting List");
		
	}
}
