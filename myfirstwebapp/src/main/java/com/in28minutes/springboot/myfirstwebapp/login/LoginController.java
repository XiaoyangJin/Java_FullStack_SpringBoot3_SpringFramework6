package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	private AuthenticationService authenticationService;
	
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	//http://localhost:8080/login?name=summer
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String gotoLoginPage() {
		
		return "login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	//login?name = lin, RequestParam
	public String gotoWelcomePage(@RequestParam String name, 
			@RequestParam String password, ModelMap model) {
		
		if(authenticationService.authenticate(name, password)) {
			model.put("name", name);
			model.put("password", password);
			
			//Authentication
			//eg. valid name = lin, valid password = lin
			
			
			return "welcome";
		}
		
		return "login";
	}
}
