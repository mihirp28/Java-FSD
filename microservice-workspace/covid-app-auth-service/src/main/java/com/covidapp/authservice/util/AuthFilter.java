package com.covidapp.authservice.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.covidapp.authservice.exception.InvalidCredentialsException;
import com.covidapp.authservice.exception.InvalidTokenException;
import com.covidapp.authservice.model.UserModel;
import com.covidapp.authservice.service.UserService;


@Component
public class AuthFilter implements Filter {

	@Autowired
	private UserService service;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		if(httpRequest.getRequestURI().startsWith("/users")) {
			chain.doFilter(httpRequest, httpResponse);
			return;
		}
		
		String token = httpRequest.getHeader("token");
		try {
		UserModel user = service.authorizeWithToken(token);
		httpRequest.setAttribute("username", user.getUsername());
		chain.doFilter(httpRequest, httpResponse);
		return;
		}
		catch (InvalidTokenException | InvalidCredentialsException ex) {
			httpResponse.setStatus(HttpStatus.UNAUTHORIZED.value());
		}
		
		
		
	}

}
