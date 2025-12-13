package com.avishka.store;

public class OrderService {
    private PaymentService paymentService;

//    public OrderService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        System.out.println("Processing order...");
        double amount = 100.0;
        paymentService.processPayment(amount);
        System.out.println("Order placed successfully!");
    }
}