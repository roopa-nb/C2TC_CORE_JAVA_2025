package com.tnsif.encapsulation;

public class Person {
	private String name;
	private int income;
	private String gender;
	private int age;
	private int tax;
	
	//this is constructors generated for data members 
	//because for more data members setter and getter will be complex
	public Person(String name, int income, String gender, int age) {
		//super();
		this.name = name;
		this.income = income;
		this.gender = gender;
		this.age = age;
	}
	
	
	public Person() {
		super();
	}


	//getter and setter methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int string) {
		this.age = string;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", tax=" + tax
				+ "]";
	}
	
	

}