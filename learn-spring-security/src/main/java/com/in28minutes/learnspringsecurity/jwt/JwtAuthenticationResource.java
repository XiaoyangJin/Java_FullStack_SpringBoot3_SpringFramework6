package com.in28minutes.learnspringsecurity.jwt;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtAuthenticationResource {
	
	//create jwt token
	private JwtEncoder jwtEncoder;
	public JwtAuthenticationResource(JwtEncoder jwtEncoder) {
		this.jwtEncoder = jwtEncoder;
	}
	
	@PostMapping("/authenticate")
	public JwtResponse authenticate(Authentication authentication) {
		return new JwtResponse("token");
	}
}

// able to return a response with token
record JwtResponse(String token) {}
