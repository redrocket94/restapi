package com.bankapp_backend.restapi.AccountHandler;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountId;
    private Long customer_id;
    private AccountType accountType;
    private double amount = 0;
    private boolean approved;

    public Account() {
    }

    public Account(Long customer_id, AccountType accountType, double amount, boolean approved) {
        this.customer_id = customer_id;
        this.accountType = accountType;
        this.amount = amount;
        this.approved = approved;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public enum AccountType {
        BUDGET,
        BUSINESS,
        DEFAULT,
        PENSION,
        SAVINGS
    }
}
