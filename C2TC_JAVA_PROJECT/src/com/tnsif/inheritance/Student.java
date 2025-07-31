package com.tnsif.inheritance;

public class Student extends Citizen {
	private int rollNo;
	private String CollegeName;
	public Student() {
		super();
	}
	public Student(String name, String address, long adharNumber, long phNo, int rollNo, String CollegName) {
		super(name, address, adharNumber, phNo); //this will call parent class constructor parameters so suoer keyword is used
		this.CollegeName=CollegeName;
		this.rollNo=rollNo;
		
		
		
		
		
		

	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	
	
	
	
	
	
	
	
	

}
