package com.example.niranjandemo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  
  
  
  
	
	
  @GetMapping("/")
	public String viewHomePage() {
	    
	    return "index";
	}
}
