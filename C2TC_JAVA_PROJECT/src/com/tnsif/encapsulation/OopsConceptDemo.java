package com.tnsif.encapsulation;

public class OopsConceptDemo {
	//data members should be in private everytime
	private int age; //whenever encapsulating data in class make it private
	private String name;
	
	public int getAge() {
//  AM     DT  METHODNAME
		//return age;
		return age;
//      RETURNS AGE BECAUSE GETTER METHOD RETRIEVWS THE VALUE
	}

    public void setAge(int age) {
//  AM     DT(returns nothing) METHODNAME
		this.age = age;
//"this" is reference variable pointing to the obj of the same class that is "age" 
	}

    public String getName() {
		return name;
	}

    public void setName(String name) {
		this.name = name;
	}

    @Override //annotation which tells to compiler that tostring() method doesnt belong to OCD class
    //
	public String toString() {  //member function accessing age and name 
    	//to string() method available in both object class and string class
    	//here we used object class to create method to string()
    	//System.out.println(obj); to print the obj in string to sting() method is used
		return "OopsConceptDemo [age=" + age + ", name=" + name + "]";
	}
//    public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    } this is normal to string() method 

}