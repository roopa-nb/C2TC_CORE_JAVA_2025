package com.tnsif.array;

import java.util.Scanner;

public class ArrayOperations {
	Scanner sc;
	
		static void printArray(int[] arr) {            //printarray method
			System.out.println("Array elements are");
			for (int i = 0; i < arr.length; i++)
				System.out.print(arr[i] + "\t");
			System.out.println();
		}
		
		void addElements(int[] arr) {                   //add elements method
			sc=new Scanner(System.in);
			System.out.println("Enter the array elements");
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
		}
	
		public static int getOddCount(int b[]) {           //get odd count method
			int count=0;
			for(int i=0;i<b.length;i++) {
				if(b[i]%2!=0) {
					count++;
				}
			}
			return count;
		}
     
		
}