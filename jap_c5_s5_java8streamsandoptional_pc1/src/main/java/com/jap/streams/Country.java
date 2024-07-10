package com.jap.streams;

public class Country {

    private String countryCode;
    private String name;
    
    //getter and setter
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Country(String countryCode, String name) {
		super();
		this.countryCode = countryCode;
		this.name = name;
	}
	
    //constructor
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

   
    //toString method
	@Override
	public String toString() {
		return "Country [countryCode=" + countryCode + ", name=" + name + "]";
	}
}