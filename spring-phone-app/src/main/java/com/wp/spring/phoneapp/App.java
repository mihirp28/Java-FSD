package com.wp.spring.phoneapp;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
	
	
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
//    	 Scanner scanner = context.getBean(Scanner.class);
//    	
//    	System.out.println("Please enter a number : ");
//    	
//    	long phnNo = scanner.nextLong();
    			
        Phone myPhone1 = context.getBean(Phone.class);
        myPhone1.setRam(6);
        Phone myPhone2 = context.getBean(Phone.class);
        myPhone2.setStorage(256);
        System.out.println("For phone 1");
        myPhone1.showSimInfo();
        System.out.println("For phone 2");
        myPhone2.showSimInfo();
        
        
    }
}
