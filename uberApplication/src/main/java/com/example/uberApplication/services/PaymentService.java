package com.example.uberApplication.services;

import com.example.uberApplication.entities.Payment;
import com.example.uberApplication.entities.Ride;
import com.example.uberApplication.entities.enums.PaymentStatus;

public interface PaymentService {

    void processPayment(Ride ride);

    Payment createNewPayment(Ride ride);

    void updatePaymentStatus(Payment payment, PaymentStatus status);
}
