package com.wp.springbootmongo.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Author {

	@Id
	private int id;
	private String authorName;
	private String country;
	
}
