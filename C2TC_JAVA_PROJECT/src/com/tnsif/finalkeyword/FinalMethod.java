package com.tnsif.finalkeyword;

public class FinalMethod {
final int a=10; //variable a having final keyowrd so it is constant
	
	public FinalMethod() { //constructor where final cant be used in constructor
		System.out.println("In the default constructor");
	}
	
	final void show() {  //method having final
		System.out.println("The value of a "+a);
	}
	
	void display(){
		
	}

}
