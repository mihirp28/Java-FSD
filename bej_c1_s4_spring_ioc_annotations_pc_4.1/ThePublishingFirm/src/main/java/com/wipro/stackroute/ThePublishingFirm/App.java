package com.wipro.stackroute.ThePublishingFirm;

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
    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	Book book=context.getBean(Book.class);
    	System.out.println(context.getBean(Book.class));
    	book.setBookName("velocity with stackRoute");
    	book.setISBNno(1454);
    	book.setAuthor(new Author("Mihir Patel-B27",22));
    	System.out.println(context.getBean(Book.class));
    }
}
