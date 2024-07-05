package com.wipro.stackroute.ThePublishingFirm;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	@Bean
	public Author creatAuthor() {

		return new Author();
	}
	
	@Bean
	public Book createBook(){
		

		return new Book();
	}

}
