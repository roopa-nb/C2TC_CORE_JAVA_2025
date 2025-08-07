package com.tnsif.finalkeyword;

public class FinalVariable {
	
	//private final int x;
	//The variable having final should be given value if not error will come
	 final int x=100;
	 
	final static int Y;
	
	final static int Z = 10;
		
	void change(){
//		this.x=200;  
//		this.Y=100;   // as you can see final keyword with x and y variable cant be re assigned
	}
	
	// Declare a static block to initialize the final static variable.
		static {
			Y = 20; // this is y inialised with value having static 
		   //Z = 100; //cant be reassigned having static keyword also
			System.out.println("Value of Y: " + Y);
		}


}