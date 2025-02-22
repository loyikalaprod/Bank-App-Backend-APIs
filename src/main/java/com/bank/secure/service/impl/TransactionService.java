package com.bank.secure.service.impl;

import com.bank.secure.dto.TransactionDto;
import com.bank.secure.entity.Transaction;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
