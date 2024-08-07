package com.example.jenkins.mypack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondDemoController {

	@GetMapping("/message")
	public String getMessage() {
		return "This is the second message of SecondDemoController";
	}
}
