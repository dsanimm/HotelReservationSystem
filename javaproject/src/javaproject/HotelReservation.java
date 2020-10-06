package javaproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelReservation {
	public static List<Hotel> hotel_List=new ArrayList<Hotel>();
	public static File file = new File("reservation.txt");
	public static FileWriter myWriter ;

	public static void addHotel() {
		Scanner s=new Scanner(System.in);

		System.out.println("Enter hotel Name");
		String hotelName=s.next();

		System.out.println("Enter weekday rate for regular customer");
		int weekdayRateRegularCustomer=s.nextInt();

		System.out.println("Enter weekend rate for regular customer");
		int weekendRateRegularCustomer=s.nextInt();

		Hotel hotel=new Hotel();
		hotel.setHotelName(hotelName);
		hotel.setWeekdayRateRegularCustomer(weekdayRateRegularCustomer);
		hotel.setWeekdayRateRegularCustomer(weekendRateRegularCustomer);
		hotel_List.add(hotel);

		try {
		myWriter=new FileWriter(file,true);
		BufferedWriter bw = new BufferedWriter(myWriter);
	    bw.write(hotel.toString());
	    bw.newLine();
	    bw.close();
        myWriter.close();
		}
		catch(Exception e) {
			System.out.println("exception occured");
		}
		System.out.println("Added successfully");

	}
}
