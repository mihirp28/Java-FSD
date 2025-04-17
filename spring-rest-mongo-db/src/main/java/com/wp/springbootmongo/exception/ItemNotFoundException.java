package com.wp.springbootmongo.exception;

public class ItemNotFoundException extends RuntimeException {

	public ItemNotFoundException(String message) {
		super(message);
	}
	
}
