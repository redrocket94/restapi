package com.bankapp_backend.restapi.CustomerHandler;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;


// Performs various operations involving Customer object
// Creates RESTful endpoints at /customers
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Customer findCustomerByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
    Customer findCustomerByEmail(@Param("email") String email);
    Customer findCustomerByUsername(@Param("username") String username);
}
