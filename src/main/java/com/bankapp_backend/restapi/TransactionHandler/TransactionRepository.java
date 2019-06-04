package com.bankapp_backend.restapi.TransactionHandler;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;


// Performs various operations involving Customer object
// Creates RESTful endpoints at /customers
public interface TransactionRepository extends PagingAndSortingRepository<Transaction, Long> {
    Transaction findTransactionsBySenderId(@Param("id") Long id);
}
