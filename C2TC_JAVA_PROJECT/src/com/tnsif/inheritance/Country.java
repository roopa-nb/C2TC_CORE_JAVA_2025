package com.tnsif.inheritance;

public class Country{
	
	private String countryName;
	private String capital;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public Country(String countryName, String capital) {
		super();
		this.countryName = countryName;
		this.capital = capital;
	}
	@Override
	public String toString() {
		return "Multilevel [countryName=" + countryName + ", capital=" + capital + "]";
	}
	

}
