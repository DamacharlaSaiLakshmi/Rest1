package com.example.rest1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest1Controller {
	
	@GetMapping("/rest1/getData")
	public String method1() {
		return "from rest1 project";
	}
}
