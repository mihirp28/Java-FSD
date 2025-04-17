package com.wp.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
//       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       
    
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       Car myCar = context.getBean("car1",Car.class);
       
       myCar.showCarInfo();
       
       myCar.start();
        
    }
}
