package com.example.uberApplication.services.Impl;

import com.example.uberApplication.dto.WalletTransactionDto;
import com.example.uberApplication.entities.WalletTransaction;
import com.example.uberApplication.repositories.WalletTransactionRepository;
import com.example.uberApplication.services.WalletTransactionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WalletTransactionServiceImpl implements WalletTransactionService {

    private final WalletTransactionRepository walletTransactionRepository;
    private final ModelMapper modelMapper;

    @Override
    public void createNewWalletTransaction(WalletTransaction walletTransaction) {
        walletTransactionRepository.save(walletTransaction);
    }

}
