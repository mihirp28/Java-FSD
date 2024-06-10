package com.jap.oops;

public class Address {
	String area; 
	String city;
    public Address(){
        //default constructor
    }

    
    public Address(String area, String city) {
		super();
		this.area = area;
		this.city = city;
	}


	public String getArea() {
        return area;
    }

    public void setArea(String area) {
            }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {

    }

    @Override
    public boolean equals(Object other) {
        return true;
    }
}
