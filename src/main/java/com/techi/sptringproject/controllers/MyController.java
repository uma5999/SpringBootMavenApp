package com.techi.sptringproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tech")
public class MyController {

	@GetMapping("/string/1")
	public String m1() {
		return "Hello1";
	}
	@GetMapping("/string/2")
	public String m2() {
		return "Hello2";
	}
	@GetMapping("/string/3")
	public String m3() {
		return "Hello3";
	}
} 
