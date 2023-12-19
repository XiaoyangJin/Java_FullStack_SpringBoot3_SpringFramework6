package com.in28minutes.learnoauth;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResourse {
	
	@GetMapping("/")
	public String helloWorld(Authentication authentication) {
		System.out.println(authentication);
		System.out.println(authentication.getPrincipal());
		return "Hello World";
	}

}

/**
OAuth2AuthenticationToken [Principal=Name: [108590356375914323833], Granted Authorities: 
[[OIDC_USER, SCOPE_https://www.googleapis.com/auth/userinfo.email, SCOPE_https://www.googleapis.com/auth/userinfo.profile, SCOPE_openid]], 
User Attributes: [{at_hash=ba1FJ-JwH782IL36sl4--g, sub=108590356375914323833, email_verified=true, iss=https://accounts.google.com, given_name=Xiaoyang, 
locale=zh-CN, nonce=6Y-jzdhXqRMdjxVp8ad7UFEfKJYJWtKgBCY5PTL9ryw, picture=https://lh3.googleusercontent.com/a/ACg8ocIxrcZ5UjlCP1HmbqBGuRs4VLnFZ8VwyTUyERUvb7xHE88=s96-c, 
aud=[7174710150-95bk8skqmb9l09itjsdnua591o13pnuq.apps.googleusercontent.com], azp=7174710150-95bk8skqmb9l09itjsdnua591o13pnuq.apps.googleusercontent.com, 
name=Xiaoyang Jin, exp=2023-12-19T05:02:32Z, family_name=Jin, iat=2023-12-19T04:02:32Z, email=xiaoyangjin4@gmail.com}], 
Credentials=[PROTECTED], Authenticated=true, Details=WebAuthenticationDetails [RemoteIpAddress=0:0:0:0:0:0:0:1, SessionId=A4FBFBAB6B60292F0BFFBBC5353FA498], 
Granted Authorities=[OIDC_USER, SCOPE_https://www.googleapis.com/auth/userinfo.email, SCOPE_https://www.googleapis.com/auth/userinfo.profile, SCOPE_openid]]
**/