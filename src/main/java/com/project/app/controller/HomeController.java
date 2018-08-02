package com.project.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class HomeController {

	@GetMapping(value="/welcome")
	public String welcome() {
		return "Welcome To the Spring World!!!!";
	}
	
}
