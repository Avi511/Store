package com.avishka.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {

    @Value("${payment-gateway:stripe}")
    private String paymentGateway;

    @Bean
    public PaymentService stripePaymentService() {
        return new StripePaymentService();
    }

    @Bean
    public PaymentService paypalPaymentService() {
        return new PayPalPaymentService();
    }
    @Lazy
    @Bean
    public OrderService orderService() {
        if ("paypal".equalsIgnoreCase(paymentGateway)) {
            return new OrderService(paypalPaymentService());
        }
        return new OrderService(stripePaymentService());
    }
}
