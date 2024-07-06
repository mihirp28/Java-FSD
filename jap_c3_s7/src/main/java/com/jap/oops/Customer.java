package com.jap.oops;

public class Customer {
	int customerId;
	String name;
	String email; 
	Address address;
    public Customer() {
        //default Constructor
    }

    public Customer(int customerId, String name, String email, Address address) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.address = address;
	}


	@Override
    public boolean equals(Object other) {
		
        return true;
			
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {

    }

  

}
