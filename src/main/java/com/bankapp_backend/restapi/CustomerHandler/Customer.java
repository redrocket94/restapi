package com.bankapp_backend.restapi.CustomerHandler;

import com.bankapp_backend.restapi.AccountHandler.Account;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;
import java.util.List;

@JsonPropertyOrder({"customerId", "username", "password", "email", "firstName", "lastName", "age", "bank"})
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private String username;
    private String password;
    private String email;
    private bank bank;
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private List<Account> accounts;


    public Customer() {
    }

    public Customer(Long id, String firstName, String lastName, int age, String username, String password, String email, bank bank) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.username = username;
        this.password = password;
        this.email = email;
        this.bank = bank;
    }

    public Customer.bank getBank() {
        return bank;
    }

    public void setBank(Customer.bank bank) {
        this.bank = bank;
    }

    public Long getCustomerId() {
        return id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    enum bank {
        COPENHAGEN,
        ODENSE
    }
}
