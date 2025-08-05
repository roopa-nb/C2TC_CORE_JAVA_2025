package com.tnsif.package1;

public class Person {
	private String personName;
	private String personCity;
	private int personAge;
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personCity=" + personCity + ", personAge=" + personAge + "]";
	}
	public Person(String personName, String personCity, int personAge) {
		this.personName = personName;
		this.personCity = personCity;
		this.personAge = personAge;
	}
	public Person() {
	}
	
	
	
	
	

}
