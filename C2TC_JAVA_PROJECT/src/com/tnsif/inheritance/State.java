package com.tnsif.inheritance;

public class State extends Country {
	private String stateName;
	private String language;
	
	
	public State(String countryName, String capital) {
		super(countryName, capital);
		// TODO Auto-generated constructor stub
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", language=" + language + "]," + super.toString();
	}
	public State() {
		super();
	}
	
	
	
	
	

}
