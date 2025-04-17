package com.wp.springbootmongo.exception;

public class DuplicateItemException extends RuntimeException {

	public DuplicateItemException(String message) {
		super(message);
	}
	
}
