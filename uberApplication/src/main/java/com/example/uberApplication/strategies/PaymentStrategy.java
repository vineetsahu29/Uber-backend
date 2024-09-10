package com.example.uberApplication.strategies;

import com.example.uberApplication.entities.Payment;

public interface PaymentStrategy {
    Double PLATFORM_COMMISSION = 0.3;
    void processPayment(Payment payment);

}
