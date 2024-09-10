package com.example.uberApplication.strategies.impl;

import com.example.uberApplication.entities.Driver;
import com.example.uberApplication.entities.Payment;
import com.example.uberApplication.entities.enums.PaymentStatus;
import com.example.uberApplication.entities.enums.TransactionMethod;
import com.example.uberApplication.repositories.PaymentRepository;
import com.example.uberApplication.services.PaymentService;
import com.example.uberApplication.services.WalletService;
import com.example.uberApplication.strategies.PaymentStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

//Rider -> 100
//Driver -> 70 Deduct 30Rs from Driver's wallet

@Service
@RequiredArgsConstructor
public class CashPaymentStrategy implements PaymentStrategy {

    private final WalletService walletService;
    private final PaymentRepository paymentRepository;

    @Override
    public void processPayment(Payment payment) {
        Driver driver = payment.getRide().getDriver();

        double platformCommission = payment.getAmount() * PLATFORM_COMMISSION;

        walletService.deductMoneyFromWallet(driver.getUser(), platformCommission, null,
                payment.getRide(), TransactionMethod.RIDE);

        payment.setPaymentStatus(PaymentStatus.CONFIRMED);
        paymentRepository.save(payment);
    }
}

//10 ratingsCount -> 4.0
//new rating 4.6
//updated rating
//new rating 44.6/11 -> 4.05