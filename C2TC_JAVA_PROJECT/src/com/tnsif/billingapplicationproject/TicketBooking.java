package com.tnsif.billingapplicationproject;

public class TicketBooking {
	
	private String stageEvent;
	private String customer;
	private String noOfSeats;
	public String getStageEvent() {
		return stageEvent;
	}
	public void setStageEvent(String stageEvent) {
		this.stageEvent = stageEvent;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(String noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public TicketBooking() {      //default constructor
		super();
	}
	public TicketBooking(String stageEvent, String customer, String noOfSeats) {   //parameter constructor
		super();
		this.stageEvent = stageEvent;
		this.customer = customer;
		this.noOfSeats = noOfSeats;
	}
	
	public void makePayemnt(double amount) {
		
	}
	

}
