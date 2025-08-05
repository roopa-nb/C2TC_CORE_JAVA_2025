package com.tnsif.inheritance;

public class MultiLevelInheritanceDemo {
	public static void main(String args[]) {
		
		City city=new City();
		city.setCityName("BANGALORE");
		city.setArea(246.2f);
		city.setStateName("karnataka");
		city.setLanguage("kannada");
		city.setCountryName("india");
		city.setCapital("delhi");
		System.out.println(city);
		
	}

}
