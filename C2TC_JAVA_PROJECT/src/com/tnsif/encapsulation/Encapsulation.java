//one java pgm can have any number of classes but must contain main class
// all class should be accessed by main class
//how many classes created those many .class files will be created
//main class is responsible to run the other classes
package com.tnsif.encapsulation;

public class Encapsulation{
	public static void main(String args[]) {
		OopsConceptDemo obj=new OopsConceptDemo();
		obj.setAge(22);
		//System.out.println(obj);//whenever obj is printed to string() method is called not nesessary to call the method name
		System.out.println(obj.getAge()); 
		obj.setName("roopa");
		System.out.println(obj.getName());
		}

}