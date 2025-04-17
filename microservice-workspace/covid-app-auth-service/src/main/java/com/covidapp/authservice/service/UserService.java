package com.covidapp.authservice.service;

import java.util.List;

import com.covidapp.authservice.model.UserCredential;
import com.covidapp.authservice.model.UserModel;

public interface UserService {

	
	
	public UserModel addUser(UserModel user);
	
	public List<UserModel> getAllUserDetails();

	String loginWithCredentials(UserCredential creds);
	
	UserModel authorizeWithToken(String token);
	
}
