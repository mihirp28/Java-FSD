package com.covidapp.authservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covidapp.authservice.exception.InvalidCredentialsException;
import com.covidapp.authservice.model.UserCredential;
import com.covidapp.authservice.model.UserModel;
import com.covidapp.authservice.repository.UserRepository;
import com.covidapp.authservice.util.JwtUtil;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private JwtUtil jwtUtil;

	@Override
	public UserModel addUser(UserModel user) {
		return repo.save(user);
	}
	
	
	@Override
	public String loginWithCredentials(UserCredential creds) {
		boolean valid = repo.existsByUsernameAndPassword(creds.getUsername(),creds.getPassword());
		if(!valid) {
			throw new InvalidCredentialsException("Incorrect Username or Password");
		}
		return jwtUtil.generateToken(creds.getUsername());
	}
	
	@Override
	public UserModel authorizeWithToken(String token) {
		
		String username = jwtUtil.decodeToken(token);
		
		UserModel user = repo.findByUsername(username);
		return user;
		
	}
	
	@Override
	public List<UserModel> getAllUserDetails() {
		return repo.findAll();
	}
	
	
}
