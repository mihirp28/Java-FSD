package com.stackroute.springdi.bean.Hobby;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CABmain {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(context.getBean("cab"));
	}

}
