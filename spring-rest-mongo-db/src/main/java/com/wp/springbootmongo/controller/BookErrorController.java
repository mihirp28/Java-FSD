package com.wp.springbootmongo.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.wp.springbootmongo.dto.ErrorResponseDto;
import com.wp.springbootmongo.exception.DuplicateItemException;
import com.wp.springbootmongo.exception.ItemNotFoundException;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
public class BookErrorController {

	HttpStatus status;
	
	@ExceptionHandler(ItemNotFoundException.class)
	public ResponseEntity<ErrorResponseDto> handleNotFoundExceptions(Exception ex, HttpServletRequest request){
		status = HttpStatus.NOT_FOUND;
		ErrorResponseDto errorObj = new ErrorResponseDto(LocalDateTime.now() ,
												status.value(), 
												status.getReasonPhrase(), 
												ex.getMessage(), 
												request.getRequestURI()
												);
		return ResponseEntity.status(status).body(errorObj);
		
		
	}
	
	@ExceptionHandler(DuplicateItemException.class)
	public ResponseEntity<ErrorResponseDto> handleDuplicateItemExceptions(Exception ex, HttpServletRequest request){
		
		log.error(ex.getMessage());
		status = HttpStatus.CONFLICT;
		ErrorResponseDto errorObj = new ErrorResponseDto(LocalDateTime.now() ,
												status.value(), 
												status.getReasonPhrase(), 
												ex.getMessage(), 
												request.getRequestURI()
												);
		log.error(errorObj.toString());
		return ResponseEntity.status(status).body(errorObj);
		
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponseDto> handleOtherExceptions(Exception ex, HttpServletRequest request){
		status = HttpStatus.INTERNAL_SERVER_ERROR;
		ErrorResponseDto errorObj = new ErrorResponseDto(LocalDateTime.now() ,
												status.value(), 
												status.getReasonPhrase(), 
												ex.getMessage(), 
												request.getRequestURI()
												);
		return ResponseEntity.status(status).body(errorObj);
		
		
	}
	
	
}
