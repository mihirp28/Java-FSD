package com.wp.springapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("engine1")
public class Engine {

	@Value("${engine.power}")
	private double power;
	@Value("${engine.cylinders}")
	private int noOfCylinders;
	
	public Engine() {
		
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	public int getNoOfCylinders() {
		return noOfCylinders;
	}
	public void setNoOfCylinders(int noOfCylinders) {
		this.noOfCylinders = noOfCylinders;
	}
	public Engine(double power, int noOfCylinders) {
		super();
		this.power = power;
		this.noOfCylinders = noOfCylinders;
	}
	
	public void showEngineInfo() {
		System.out.println("Engine - Power : "+power);
		System.out.println("No of Cylinders : "+noOfCylinders);
	}
	
	public void startEngine() {
		System.out.println("Engine Started..");
	}
	@Override
	public String toString() {
		return "Engine [power=" + power + ", noOfCylinders=" + noOfCylinders + "]";
	}
	
	
	
	
	
	
}
