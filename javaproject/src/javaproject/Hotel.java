package javaproject;

import java.io.Serializable;

public class Hotel implements Serializable{
	String hotelName;
	int weekendRateRegularCustomer;
	int weekdayRateRegularCustomer;
	int weekendRateRewardCustomer;
	int weekdayRateRewardCustomer;
	int hotelRatings;
	public Hotel(String hotelName, int weekendRateRegularCustomer, int weekdayRateRegularCustomer,
			int weekendRateRewardCustomer, int weekdayRateRewardCustomer, int hotelRatings) {
		super();
		this.hotelName = hotelName;
		this.weekendRateRegularCustomer = weekendRateRegularCustomer;
		this.weekdayRateRegularCustomer = weekdayRateRegularCustomer;
		this.weekendRateRewardCustomer = weekendRateRewardCustomer;
		this.weekdayRateRewardCustomer = weekdayRateRewardCustomer;
		this.hotelRatings = hotelRatings;
	}
	public int getWeekendRateRewardCustomer() {
		return weekendRateRewardCustomer;
	}
	public void setWeekendRateRewardCustomer(int weekendRateRewardCustomer) {
		this.weekendRateRewardCustomer = weekendRateRewardCustomer;
	}
	public int getWeekdayRateRewardCustomer() {
		return weekdayRateRewardCustomer;
	}
	public void setWeekdayRateRewardCustomer(int weekdayRateRewardCustomer) {
		this.weekdayRateRewardCustomer = weekdayRateRewardCustomer;
	}
	public int getHotelRatings() {
		return hotelRatings;
	}
	public void setHotelRatings(int hotelRatings) {
		this.hotelRatings = hotelRatings;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getWeekendRateRegularCustomer() {
		return weekendRateRegularCustomer;
	}
	public void setWeekendRateRegularCustomer(int weekendRateRegularCustomer) {
		this.weekendRateRegularCustomer = weekendRateRegularCustomer;
	}
	public int getWeekdayRateRegularCustomer() {
		return weekdayRateRegularCustomer;
	}
	public void setWeekdayRateRegularCustomer(int weekdayRateRegularCustomer) {
		this.weekdayRateRegularCustomer = weekdayRateRegularCustomer;
	}
	@Override
	public String toString() {
		return hotelName + ","  + weekendRateRegularCustomer
				+ ","+ weekdayRateRegularCustomer+","+hotelRatings+ ","  + weekendRateRewardCustomer+ ","  + weekdayRateRewardCustomer;
	}
	public Hotel(String hotelName, int weekendRateRegularCustomer, int weekdayRateRegularCustomer, int hotelRatings) {
		super();
		this.hotelName = hotelName;
		this.weekendRateRegularCustomer = weekendRateRegularCustomer;
		this.weekdayRateRegularCustomer = weekdayRateRegularCustomer;
		this.hotelRatings = hotelRatings;
	}
	public Hotel() {
		// TODO Auto-generated constructor stub
	}

	
}
