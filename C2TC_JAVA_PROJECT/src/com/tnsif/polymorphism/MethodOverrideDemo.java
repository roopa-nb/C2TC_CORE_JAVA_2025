package com.tnsif.polymorphism;

public class MethodOverrideDemo {

	public static void main(String[] args) {
//		RBI obj;
		
		RBI obj = new RBI();
		System.out.println(obj.getRateOfInterest());
		
		SBI obj1 = new SBI();
		System.out.println(obj1.getRateOfInterest()); //output 6.4
		
		HDFC obj3 = new HDFC();
		System.out.println(obj3.getRateOfInterest()); //output 7.8
		
//		obj=new HDFC();
//		System.out.println(obj.getRateOfInterest()); //output 7.8

	}

}
