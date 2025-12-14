package com.avishka.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;

    public OrderService(){}
    @Autowired
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }


    public void placeOrder() {
        System.out.println("Processing order...");
        double amount = 100.0;
        paymentService.processPayment(amount);
        System.out.println("Order placed successfully!");
    }
}