package com.bankapp_backend.restapi;

import com.bankapp_backend.restapi.AccountHandler.Account;
import com.bankapp_backend.restapi.CustomerHandler.Customer;
import com.bankapp_backend.restapi.CustomerHandler.CustomerRepository;
import com.bankapp_backend.restapi.TransactionHandler.Transaction;
import com.bankapp_backend.restapi.TransactionHandler.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class MyRestController {

    // CustomerController
    @Autowired
    CustomerRepository customerRepository;

    @PutMapping(path = "/customers", consumes = {"application/json"})
    public Customer saveOrUpdateCustomer(@RequestBody Customer customer) {
        customer = customerRepository.save(customer);
        return customer;
    }

    @GetMapping(path = "/customers")
    public Iterable<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @PostMapping(path = "/customers", consumes = {"application/json"})
    public Customer createCustomer(@RequestBody Customer customer) {

        List<Account> default_accounts = Arrays.asList(
                (new Account(customer.getCustomerId(), Account.AccountType.DEFAULT, 0, true)),
                (new Account(customer.getCustomerId(), Account.AccountType.BUDGET, 0, true)));
        customer.setAccounts(default_accounts);

        customerRepository.save(customer);
        return customer;
    }

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
