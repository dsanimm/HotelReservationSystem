package javaproject;

import java.io.IOException;
import java.util.Scanner;

public class HotelReservationSystem {

		public static void main(String[] args) throws IOException {
			Scanner s=new Scanner(System.in);
			System.out.println("Welcome to Hotel Reservation Program");

			do {
				System.out.println("Enter your choice");
				System.out.println("1.Add a new Hotel.");
				System.out.println("2.Find a new Hotel.");
				System.out.println("3.Find cheap best new Hotel.");
				System.out.println("4.Exit.");
				int choice=s.nextInt();
				if(choice==4)
					break;
				switch(choice) {
				case 1:HotelReservation.addHotel();
					   break;
				case 2:HotelReservation.findCheapHotel();
				   break;
				case 3:HotelReservation.findCheapBestRatedHotel();
				   break;
			    default:System.out.println("Do nothing");
				}
			}while(true);



		}
}
