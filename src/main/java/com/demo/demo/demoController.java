package com.demo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
	@GetMapping("/msg")
	public String show() {
		return "WELOME JENKIN";
	}

}
