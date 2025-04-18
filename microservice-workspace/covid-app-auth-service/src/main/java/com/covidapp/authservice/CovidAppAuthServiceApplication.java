package com.covidapp.authservice;

import org.springframework.boot.SpringApplication;

import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class CovidAppAuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidAppAuthServiceApplication.class, args);
	}
	
//	@Bean
//	public CorsFilter corsFilter() {
//
//		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//
//		final CorsConfiguration config = new CorsConfiguration();
//
//		config.setAllowCredentials(true);
//
//		config.addAllowedOrigin("http://localhost:4200");
//
//		config.addAllowedHeader("Access-Control-Allow-Origin");
//		// config.addAllowedHeader("*");
//
//		config.addAllowedMethod("OPTIONS");
//
//		config.addAllowedMethod("HEAD");
//
//		config.addAllowedMethod("GET");
//
//		config.addAllowedMethod("PUT");
//
//		config.addAllowedMethod("POST");
//
//		config.addAllowedMethod("DELETE");
//
//		config.addAllowedMethod("PATCH");
//
//		source.registerCorsConfiguration("/**", config);
//
//		return new CorsFilter(source);
//
//	}
//	
	
	

}
