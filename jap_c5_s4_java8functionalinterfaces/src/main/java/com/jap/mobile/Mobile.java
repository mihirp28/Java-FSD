package com.jap.mobile;

public class Mobile {
    // Declare the attributes for the Mobile cl
	private String brandName;
	private String modelNo;
	private double amount;
	private int quantity;
    //Define parameterized constructors
    

    // Define getter and setters
    

    public Mobile(String brandName, String modelNo, double amount, int quantity) {
		super();
		this.brandName = brandName;
		this.modelNo = modelNo;
		this.amount = amount;
		this.quantity = quantity;
	}


	public String getBrandName() {
		return brandName;
	}


	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}


	public String getModelNo() {
		return modelNo;
	}


	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	   // Override the to String method


	@Override
	public String toString() {
		return "Mobile [brandName=" + brandName + ", modelNo=" + modelNo + ", amount=" + amount + ", quantity="
				+ quantity + "]";
	}





}