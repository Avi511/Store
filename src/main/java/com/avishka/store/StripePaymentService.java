package com.avishka.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("stripe")
@Primary
public class StripePaymentService implements PaymentService {

    @Value("${spring.application.name}")
    private String apiURL;

    @Value("${strpe.enabled}")
    private boolean enabled;

    @Value("${stripe.timedout:3000}")
    private int timeout;

    @Override
    public void processPayment(double amount){
        System.out.println("STRIPE");
        System.out.println("Amount "+amount);
    }
}
