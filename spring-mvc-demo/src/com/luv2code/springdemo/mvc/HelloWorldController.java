package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	//need a controller method to show the inital form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
//	@RequestMapping("")
//	public 
	
	
	
	
	//need a controller method to process the HTML form

}
