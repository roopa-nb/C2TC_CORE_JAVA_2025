package com.tnsif.constructors;

public class Customer {
	private String customerName;
	private String customerCity;
	private int customerId;
	
	
	// this is one method getter and setter to give values or initialise the data member 
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	//this is constructor without paramater
	//if we initialise something using this then that will be default because there is no paramater
	public Customer() {
		this.customerCity="world";
		this.customerId=103;
		this.customerName="gayathri";
		
	}
	
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerCity=" + customerCity + ", customerId="
				+ customerId + "]";
	}
	//this is other method to initialise class members
	//here class members are customername, customercity, customerid
	//parameterized constructor having parametrs inside method
	public Customer(String customerName, String customerCity, int customerId) {
		super();
		this.customerName = customerName;
		this.customerCity = customerCity;
		this.customerId = customerId;
	}
	
	
	
	
	
	
	
	

}
