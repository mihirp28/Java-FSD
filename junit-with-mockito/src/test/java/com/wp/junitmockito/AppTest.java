package com.wp.junitmockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.wp.junitmockito.service.AppService;
import com.wp.junitmockito.service.AppServiceImpl;
@ExtendWith(MockitoExtension.class)
class AppTest {
	
	@Mock
	AppService service;

	@InjectMocks
	App app;
	

	
	@Test
	void testCheckValue() {
		when(service.check()).thenReturn(true);
		
		assertTrue(app.checkValue());
	}

}
