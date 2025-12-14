package com.avishka.store;

import com.avishka.store.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Service
public class OrderService {

    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        System.out.println("Processing order...");
        paymentService.processPayment(100.0);
        System.out.println("Order placed successfully!");
    }
}
