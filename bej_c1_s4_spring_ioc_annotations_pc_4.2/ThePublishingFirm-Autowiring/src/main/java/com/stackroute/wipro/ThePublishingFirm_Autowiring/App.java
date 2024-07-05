package com.stackroute.wipro.ThePublishingFirm_Autowiring;

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
        Author author=context.getBean(Author.class);
        author.setName("Mihir Patel");
        author.setAge(22);
        Book book=context.getBean(Book.class);
        book.setName("velocity with stackRoute B-27");
        book.setISBN(2542);
        System.out.println(context.getBean(Book.class));
    }
}
