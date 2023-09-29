package com.javatechie.os.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public TransactionResponse saveOrder(TransactionRequest tRequest) {
		
		String response ="";
		Order order = tRequest.getOrder();
		Payment payment = tRequest.getPayment();
		payment.setOrderId(order.getId());
		payment.setAmount(order.getPrice());
		
		Payment paymentResponse = restTemplate.postForObject("http://PAYMENT-SERVICE/payment/doPayment", payment, Payment.class);
		
		response = paymentResponse.getPayamentStatus().equals("success")?"Sucessfull":"Failed";

		orderRepo.save(order);
		
		return new TransactionResponse(order,paymentResponse.getAmount(),
				paymentResponse.getTransactionId(),response);
		
	}

}
