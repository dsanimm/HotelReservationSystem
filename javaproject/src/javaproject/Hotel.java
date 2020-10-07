package javaproject;

import java.io.Serializable;

public class Hotel implements Serializable{
	String hotelName;
	int weekendRateRegularCustomer;
	int weekdayRateRegularCustomer;
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
				+ ","+ weekdayRateRegularCustomer;
	}

	
}
