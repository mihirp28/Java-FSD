package com.covidapp.authservice.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covidapp.authservice.dto.ResponseDto;

@RestController
@RequestMapping("/app")

public class AppController {

	@GetMapping
	public ResponseDto sayHello(HttpServletRequest m) {
		String msg= "Hello "+m.getAttribute("username");
		ResponseDto response = new ResponseDto();
		response.setMessage(msg);
		return response;
	}
	
}
