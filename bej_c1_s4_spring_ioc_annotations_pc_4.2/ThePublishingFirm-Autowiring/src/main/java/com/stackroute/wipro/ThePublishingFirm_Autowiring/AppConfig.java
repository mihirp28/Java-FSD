package com.stackroute.wipro.ThePublishingFirm_Autowiring;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	@Bean
	public Author createAuthor() {
		return new Author();
	}
	
	@Bean
	public Book createBook() {
		return new Book();
	}
}
