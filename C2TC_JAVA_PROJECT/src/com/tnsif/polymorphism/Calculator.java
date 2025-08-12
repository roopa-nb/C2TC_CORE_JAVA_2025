package com.tnsif.polymorphism;

public class Calculator {
	
	private int numOne,numTwo,numThree;
	private float numFour,numFive;
	
	
	
	
	public int getNumOne() {
		return numOne;
	}
	public void setNumOne(int numOne) {
		this.numOne = numOne;
	}
	public int getNumTwo() {
		return numTwo;
	}
	public void setNumTwo(int numTwo) {
		this.numTwo = numTwo;
	}
	public int getNumThree() {
		return numThree;
	}
	public void setNumThree(int numThree) {
		this.numThree = numThree;
	}
	public float getNumFour() {
		return numFour;
	}
	public void setNumFour(float numFour) {
		this.numFour = numFour;
	}
	public float getNumFive() {
		return numFive;
	}
	public void setNumFive(float numFive) {
		this.numFive = numFive;
	}
	public Calculator() {
		this.numOne=10;
		this.numTwo=20;
		this.numThree=30;
		this.numFour=40.0f;
		this.numFive=50.0f; //default constructor
		
	}
	public Calculator(int numOne, int numTwo, int numThree) {  //constructor with int variables
		super();
		this.numOne = numOne;
		this.numTwo = numTwo;
		this.numThree = numThree;
	}
	public Calculator(float numFour, float numFive) { //constructor with float variables
		super();
		this.numFour = numFour;
		this.numFive = numFive;
	}
	
	//public void add(int a,int b) { shows error becuase same emthod name add and same type of data types
		
	
	
	public int add(int a,int b,float c) {
		int d=(int)(a+b+c);
		return d;
	
		
	}
	
	
	public int add(int a, int b) {
		int x=a+b;
		return x;
		
	}
	
	public int add(int a, float b) {
		int y=(int)(a+b);
		return y;
		
	}

}
