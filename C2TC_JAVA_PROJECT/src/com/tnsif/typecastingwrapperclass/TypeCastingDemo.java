package com.tnsif.typecastingwrapperclass;

public class TypeCastingDemo {
	
	public static void main (String args[]) {
		//IMPLICIT, WIDENING, SMALL TO BIG
		byte b=10;
		int a=b;
		System.out.println(a);
		
		float f =22.45f;
		double d=f;
		System.out.println(d);
		
		char c='A';
		int q=c;
		System.out.println(q);
		
		char v='\u00A7';
		int w=v;
		System.out.println(w);
		
		//EXPLICIT,NARROWING,BIG TO SMALL
		
		double d1=10.65f;
		long l1=(long)d1;
		System.out.println(l1);
		
		int p=45866;
		//short t=p; //mismatch error will occur
		short t = (short)p;
		System.out.println(t);
		}
}