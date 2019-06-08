package com.bankapp_backend.restapi.TransactionHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    // TransactionController
    @Autowired
    TransactionRepository transactionRepository;

    @GetMapping(path = "/transactions")
    public Iterable<Transaction> getTransactions() {
        return transactionRepository.findAll();
    }

    @PostMapping(path = "/transactions", consumes = {"application/json"})
    public Transaction createTransaction(@RequestBody Transaction transaction) {

        transactionRepository.save(transaction);
        return transaction;
    }
}
