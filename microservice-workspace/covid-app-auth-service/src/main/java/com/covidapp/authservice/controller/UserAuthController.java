package com.covidapp.authservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covidapp.authservice.model.AuthToken;
import com.covidapp.authservice.model.UserCredential;
import com.covidapp.authservice.model.UserModel;
import com.covidapp.authservice.service.UserService;

@RestController
@RequestMapping("/users")

public class UserAuthController {

	@Autowired
	UserService service;
	
	@PostMapping("/login")
	public AuthToken authenticateUser(@RequestBody UserCredential credentials) {
		String token = service.loginWithCredentials(credentials);
		return new AuthToken(token);
	}
	
	@PostMapping("/register")
	public UserModel addUser(@RequestBody UserModel userModel) {
		return service.addUser(userModel);
	}
	
	
	
	
	
}
