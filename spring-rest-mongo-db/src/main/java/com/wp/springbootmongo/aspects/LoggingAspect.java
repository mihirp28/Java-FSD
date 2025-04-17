package com.wp.springbootmongo.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

	@AfterReturning("bookServicePointcut()")
	public void showSuccesLogs() {
		log.info("Data Accessed/Update from MongoDb");
	}
	
	@Before("execution (* com.wp.springbootmongo.service.BookServiceImpl.getBook(..))")
	public void showDbAccessLogs() {
		log.info("Trying to access data from Mongo DB");
	}
	
	@AfterThrowing(pointcut = "bookServicePointcut()", throwing = "ex")
	public void showErrorLogs(Exception ex) {
		log.error(ex.getMessage());
	}
	
	@Pointcut("within(com.wp.springbootmongo.service.BookServiceImpl)")
	public void bookServicePointcut() { }
	
}
