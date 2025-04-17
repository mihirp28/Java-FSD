package com.wp.springapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("car.properties")
@ComponentScan(basePackages = "com.wp.springapp")
public class AppConfig {

	@Bean(name = "engine2")
	public Engine getEngine2Bean() {
		Engine engine2 = new Engine(125.82, 2);
		return engine2;
	}
//	
//	@Bean(name = "car1")
//	public Car getCar1Bean() {
//		Car car1 = new Car();
////		car1.setColor("Red");
////		car1.setModel("Mahindra Thar");
////		car1.setEngine(getEngine1Bean());
//		return car1;
//	}
	
	
}
