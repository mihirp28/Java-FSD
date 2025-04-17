package com.covidapp.countryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class CovidAppCountryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidAppCountryServiceApplication.class, args);
	}
	
	@Bean("rt-eureka")
	@LoadBalanced
	public RestTemplate getRestTemplateBean() {
		return new RestTemplate();
	}
	
	@Bean("rt-no-eureka")
	public RestTemplate getRestTemplateBeanWithotEureka() {
		return new RestTemplate();
	}

}
