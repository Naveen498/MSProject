package com.javatechie.os.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	
	@GetMapping("/get")
	public String getData() {
		return "Naveen";
	}

}
