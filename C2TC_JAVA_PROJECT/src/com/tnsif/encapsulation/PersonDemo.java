package com.tnsif.encapsulation;

import java.util.Scanner;

public class PersonDemo {
	public static void main(String args[]) {
		
//	Person obj=new Person();
//	obj.setAge(22);
//	obj.setGender("female");
//	obj.setIncome(20000);
//	obj.setName("roopa");
//	//so now if we have so many data getter and setter will be complex because everytime
//	//setting and getting values in main class will be complex
//	//so constructors can be used.
	
	Person p1=new Person("Roopa",20000,"female",22);
	System.out.println(p1);
	
	Person p2=new Person();
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the name of the person");
	p2.setName(sc.next());
	
	System.out.println("enter the age of the person");
	p2.setAge(sc.nextInt());  //next is a method
	
	
	System.out.println("enter the gender of the person");
	p2.setGender(sc.next());
	
	System.out.println("enter the salary of the person");
	p2.setIncome(sc.nextInt());
	
	
	
	
	
	
	
	

}
}