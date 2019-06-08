package com.bankapp_backend.restapi.TransactionHandler;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;


public interface TransactionRepository extends PagingAndSortingRepository<Transaction, Long> {
    Iterable<Transaction> findTransactionsBySenderId(@Param("senderId") Long senderId);
}
