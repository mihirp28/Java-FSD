package com.stackroute.newz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


/*This class will contain bean for viewresolver
 * Define the following annotations:
 * @Configuration - Annotating a class with the @Configuration indicates that the 
 *                  class can be used by the Spring IoC container as a source of 
 *                  bean definitions
 * @ComponentScan - this annotation is used to search for the Spring components amongst the application
 * @EnableWebMvc - Adding this annotation to an @Configuration class imports the Spring MVC 
 * 				   configuration from WebMvcConfigurationSupport 
 * */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.stackroute.newz")
public class WebMvcConfig implements WebMvcConfigurer {

	/*
	 * Define the bean for view resolver so that it can be used to resolve the JSP
	 * files which are existing in /WEB-INF/views folder. A ViewResolver is capable
	 * of mapping logical view names to actual views, such as a JSP or a HTML page.
	 */
	
	@Bean
	
	public InternalResourceViewResolver getresolver()
	{
		InternalResourceViewResolver isrobj=new InternalResourceViewResolver();
		isrobj.setPrefix("/WEB-INF/views/");
		isrobj.setSuffix(".jsp");
		return isrobj;
	}
	
}
