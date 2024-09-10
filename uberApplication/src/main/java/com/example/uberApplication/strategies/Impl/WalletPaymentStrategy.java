package com.example.uberApplication.strategies.impl;

import com.example.uberApplication.entities.Driver;
import com.example.uberApplication.entities.Payment;
import com.example.uberApplication.entities.Rider;
import com.example.uberApplication.entities.enums.PaymentStatus;
import com.example.uberApplication.entities.enums.TransactionMethod;
import com.example.uberApplication.repositories.PaymentRepository;
import com.example.uberApplication.services.PaymentService;
import com.example.uberApplication.services.WalletService;
import com.example.uberApplication.strategies.PaymentStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//Rider had 232, Driver had 500
//Ride cost is 100, commission = 30
//Rider -> 232-100 = 132
//Driver -> 500 + (100 - 30) = 570

@Service
@RequiredArgsConstructor
public class WalletPaymentStrategy implements PaymentStrategy {

    private final WalletService walletService;
    private final PaymentRepository paymentRepository;

    @Override
    @Transactional
    public void processPayment(Payment payment) {
        Driver driver = payment.getRide().getDriver();
        Rider rider = payment.getRide().getRider();

        walletService.deductMoneyFromWallet(rider.getUser(),
                payment.getAmount(), null, payment.getRide(), TransactionMethod.RIDE);

        double driversCut = payment.getAmount() * (1 - PLATFORM_COMMISSION);

        walletService.addMoneyToWallet(driver.getUser(),
                driversCut, null, payment.getRide(), TransactionMethod.RIDE);

        payment.setPaymentStatus(PaymentStatus.CONFIRMED);
        paymentRepository.save(payment);
    }
}
