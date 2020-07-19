package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp"
;		
	}
	@RequestMapping("/login")
	public String login() {
		return "login.jsp"
;		
	}
	@RequestMapping("/logout")
	public String logout() {
		return "logout.jsp"
;		
	}
}
