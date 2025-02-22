package com.bank.secure.service.impl;

import com.bank.secure.dto.TransactionDto;
import com.bank.secure.entity.Transaction;
import com.bank.secure.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionImpl implements TransactionService{
    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public void saveTransaction(TransactionDto transactionDto) {
    Transaction transaction = Transaction.builder()
            .transactionType(transactionDto.getTransactionType())
            .accountNumber(transactionDto.getAccountNumber())
            .amount(transactionDto.getAmount())
            .status("SUCCES")
            .build();
    transactionRepository.save(transaction);
    System.out.println("transaction enregistrer avec succes!");
    }



}
