package com.stackroute.springdi.bean.Hobby;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Product_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext app= new ClassPathXmlApplicationContext("beans.xml");
	Product pr = new Product();
	Product pro = (Product) app.getBean("Pro");
	System.out.println(pro);
	}

}
