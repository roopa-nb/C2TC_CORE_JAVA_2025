package com.tnsif.inheritance;

public class Citizen {
	private String name;
	private String address;
	private long adharNumber; //long because int exceeds the range
	private long phNo;
	public Citizen(String name, String address, long adharNumber, long phNo) {
		this.name = name;
		this.address = address;
		this.adharNumber = adharNumber;
		this.phNo = phNo;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", address=" + address + ", adharNumber=" + adharNumber + ", phNo=" + phNo
				+ "]";
	}
	public Citizen() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(long adharNumber) {
		this.adharNumber = adharNumber;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	} 
	
	
	
	
	
	
	
	

}
