package com.tnsif.polymorphism;

public class PplymorphismDemo {
	
	public static void main(String args[]) {
		Calculator cl=new Calculator();
		int result=cl.add(cl.getNumOne(), cl.getNumTwo());
		System.out.println(result);
		
		Calculator c2 = new Calculator();
		int result2=cl.add(cl.getNumThree(),cl.getNumFour());
		System.out.println(result2);
		
		Calculator c3 = new Calculator(100,200);
		//c3.add(c3.getNumOne(),c3.getNumTwo());
		System.out.println(c3.add(c3.getNumOne(),c3.getNumTwo()));
	}
} 
