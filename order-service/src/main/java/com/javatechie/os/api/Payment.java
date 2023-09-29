package com.javatechie.os.api;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

	private int paymentId;
	private String payamentStatus;
	private String transactionId;
	private int orderId;
	private double amount;
}
