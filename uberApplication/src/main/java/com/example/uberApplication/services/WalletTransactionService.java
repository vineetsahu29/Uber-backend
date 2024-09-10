package com.example.uberApplication.services;

import com.example.uberApplication.dto.WalletTransactionDto;
import com.example.uberApplication.entities.WalletTransaction;

public interface WalletTransactionService {

    void createNewWalletTransaction(WalletTransaction walletTransaction);

}
