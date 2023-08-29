package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("lin");
		boolean isValidPassword = password.equalsIgnoreCase("lin");
		
		return isValidUserName && isValidPassword;
	}
}
