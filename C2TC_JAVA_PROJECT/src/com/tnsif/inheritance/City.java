package com.tnsif.inheritance;

public class City extends State{
	private String cityName;
	private float area;
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public City(String countryName, String capital) {
		super(countryName, capital);
		// TODO Auto-generated constructor stub
	}
	public City() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", area=" + area + "]," + super.toString();
	}
	
	
	

}
