package com.in28minutes.springboot.myfirstwebapp.login;

public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("lin");
		boolean isValidPassword = password.equalsIgnoreCase("lin");
		
		return isValidUserName && isValidPassword;
	}
}
