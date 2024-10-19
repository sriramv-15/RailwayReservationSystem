package com.railwayreservation;

import java.util.Scanner;

public class Driver_Class {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TrainTicketBooking ticketBooking = new TrainTicketBooking();
		
		while(true) {
			System.out.println("\nChoose an option");
			System.out.println("1. Book Tickets");
			System.out.println("2. Cancel Tickets");
			System.out.println("3. Print Chart");
			System.out.println("4. Exit");
			System.out.print("Your option: ");
			
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.print("Enter source station: (A/B/C/D/E):- ");
				String from = sc.nextLine().toUpperCase();
				
				System.out.print("Enter destination station: (A/B/C/D/E):- ");
				String to = sc.nextLine().toUpperCase();
				
				System.out.print("Enter the number of seats: ");
				int seats = sc.nextInt();
				sc.nextLine(); //after getting int, we need to consume new line
				
				System.out.println();
				
				ticketBooking.book(from, to, seats);
				break;
				
			case 2:
				System.out.print("Enter PNR number to cancel: ");
				int pnr = sc.nextInt();
				System.out.println("Enter the number of tickets to cancel");
				int seatsToCancel = sc.nextInt();
				sc.nextLine();
				
				ticketBooking.cancel(pnr, seatsToCancel);
				break;
				
			case 3:
				ticketBooking.printChart();
				break;
				
			case 4:
				System.out.println("Exiting..");
				sc.close();
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid choice");
				break;
					
			}
		}

	}

}
