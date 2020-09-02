package com.springoauth.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
	


	@GetMapping("/")
	public String index(){
		
		return "Welcome to our website.";
	}
	
	@GetMapping("/login")
	public void login() {

	}

	@GetMapping("/logout")
	public void logout() {
		
	}
	
	@GetMapping("/user")
	public String user(Principal principal) {
		return principal.toString();
	}
	

	@GetMapping("/logout-display")
	public String loggedOut() {
		return "You have been logged out";
	}
	

}
