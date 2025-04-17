package com.wp.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("car1")
public class Car {

	@Value("${car.model}")
	private String model;
	@Value("${car.color}")
	private String color;
	
	@Autowired
	@Qualifier("engine2")
	private Engine engine;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Car() {
	}
	public Car(String model, String color, Engine engine) {
		super();
		this.model = model;
		this.color = color;
		this.engine = engine;
	}
	
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", engine=" + engine + "]";
	}
	public void showCarInfo() {
		System.out.println(this);
	}
	
	public void start() {
		engine.startEngine();
	}
	
}
