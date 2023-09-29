package com.javatechie.os.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/bookOrder")
	public TransactionResponse bookOrder(@RequestBody TransactionRequest tRequest) {
		
		new ResponseEntity<>(
			      "Your age is ", HttpStatus.OK);
		return orderService.saveOrder(tRequest);
		
	}
	
	@GetMapping("/test")
	public String getOrder() {
		return "Naveen";
		
	}
	
	public static int num(int a) {
		return a;
	}
}
