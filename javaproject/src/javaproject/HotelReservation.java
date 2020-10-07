package javaproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HotelReservation implements Serializable {
	public static List<Hotel> hotel_List = new ArrayList<Hotel>();
	public static File file = new File("reservation.txt");
	public static FileWriter myWriter;
	public static FileReader myReader;
	static Scanner s = new Scanner(System.in);

	public static void addHotel() {
		System.out.println("Enter hotel Name");
		String hotelName = s.next();

		System.out.println("Enter weekday rate for regular customer");
		int weekdayRateRegularCustomer = s.nextInt();

		System.out.println("Enter weekend rate for regular customer");
		int weekendRateRegularCustomer = s.nextInt();

		System.out.println("Enter Rating for the Hotel");
		int rating = s.nextInt();

		Hotel hotel = new Hotel();
		hotel.setHotelName(hotelName);
		hotel.setWeekdayRateRegularCustomer(weekdayRateRegularCustomer);
		hotel.setWeekendRateRegularCustomer(weekendRateRegularCustomer);
		hotel.setHotelRatings(rating);
		hotel_List.add(hotel);

		try {
			myWriter = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(myWriter);
			bw.write(hotel.toString());
			bw.newLine();
			bw.close();
			myWriter.close();
		} catch (Exception e) {
			System.out.println("exception occured");
		}
		System.out.println("Added successfully");

	}

	public static void findCheapHotel() {
		System.out.println("Enter Start Date");
		String startRange = s.next();
		System.out.println("Enter End Date");
		String endRange = s.next();
		System.out.println(endRange);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMMyyyy");
		LocalDate startDate = LocalDate.parse(startRange, formatter);
		LocalDate endDate = LocalDate.parse(endRange, formatter);
		LocalDate tempDate = startDate;
		Map<String, Integer> totalRates = new HashMap<String, Integer>();

		try {
			myReader = new FileReader(file);
			BufferedReader br = new BufferedReader(myReader);

			String line;
			while ((line = br.readLine()) != null) {
				int totalRate = 0, rate = 0;
				String[] hotel = line.split(",");
				int weekendrate = Integer.parseInt(hotel[1]);
				int weekdayrate = Integer.parseInt(hotel[2]);
				while (tempDate.compareTo(endDate) != 0) {
					tempDate = tempDate.plusDays(1);
					DayOfWeek dayOfWeek = DayOfWeek.from(tempDate);
					if (dayOfWeek.getValue() == 6 || dayOfWeek.getValue() == 7) {
						rate = weekendrate;
					} else {
						rate = weekdayrate;
					}
					totalRate = totalRate + rate;
				}
				tempDate = startDate;
				System.out.println("Rate for " + hotel[0] + " for given range fo dates are: " + totalRate);
				totalRates.put(hotel[0], totalRate);
			}
		} catch (

		Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(
				"Minimum is: " + totalRates.entrySet().stream().min((s1, s2) -> s1.getValue() - s2.getValue()));
	}

	public static void findCheapBestRatedHotel() {
		System.out.println("Enter Start Date");
		String startRange = s.next();
		System.out.println("Enter End Date");
		String endRange = s.next();
		System.out.println(endRange);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMMyyyy");
		LocalDate startDate = LocalDate.parse(startRange, formatter);
		LocalDate endDate = LocalDate.parse(endRange, formatter);
		LocalDate tempDate = startDate;
		Map<Integer, Hotel> totalRates = new HashMap<Integer, Hotel>();

		try {
			myReader = new FileReader(file);
			BufferedReader br = new BufferedReader(myReader);

			String line;
			while ((line = br.readLine()) != null) {
				int totalRate = 0, rate = 0;
				String[] hotel = line.split(",");
				int weekendrate = Integer.parseInt(hotel[1]);
				int weekdayrate = Integer.parseInt(hotel[2]);
				while (tempDate.compareTo(endDate) != 0) {
					tempDate = tempDate.plusDays(1);
					DayOfWeek dayOfWeek = DayOfWeek.from(tempDate);
					if (dayOfWeek.getValue() == 6 || dayOfWeek.getValue() == 7) {
						rate = weekendrate;
					} else {
						rate = weekdayrate;
					}
					totalRate = totalRate + rate;
				}
				tempDate = startDate;
				System.out.println("Rate for " + hotel[0] + " for given range fo dates are: " + totalRate);
				totalRates.put(totalRate, new Hotel(hotel[0], Integer.parseInt(hotel[1]), Integer.parseInt(hotel[2]),
						Integer.parseInt(hotel[3])));
			}
		} catch (

		Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(totalRates.entrySet().stream()
				.max((s1, s2) -> s1.getValue().hotelRatings - s2.getValue().hotelRatings).stream()
				.min((a, b) -> a.getKey() - b.getKey()).map(a -> a.getValue()).toString());

				

	}
}
