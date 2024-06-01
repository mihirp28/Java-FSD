package com.stackroute.springdi.bean.Hobby;

public class Product {
	private String Pname;
	private float Pcost;
	private String Pid;
	public Product() {
		
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public float getPcost() {
		return Pcost;
	}
	public void setPcost(float pcost) {
		Pcost = pcost;
	}
	public String getPid() {
		return Pid;
	}
	public void setPid(String pid) {
		Pid = pid;
	}
	@Override
	public String toString() {
		return "Product [Pname=" + Pname + ", Pcost=" + Pcost + ", Pid=" + Pid + "]";
	}
	
	
	
	

}
