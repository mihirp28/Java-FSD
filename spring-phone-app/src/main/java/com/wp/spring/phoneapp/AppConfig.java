package com.wp.spring.phoneapp;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages =  {"com.wp.spring.phoneapp"})
@PropertySource("app.properties")
public class AppConfig {

	@Bean("scanner")
	public Scanner getScannerBean() {
		return new Scanner(System.in);
	}
	
}
