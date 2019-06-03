package com.bankapp_backend.restapi;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long transaction_id;
    private String customer_id;
    private String recipient;
    private double amount_transferred = 0;
    private String date;

    public Transaction() {
    }

    public Long getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(Long transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public double getAmount_transferred() {
        return amount_transferred;
    }

    public void setAmount_transferred(double amount_transferred) {
        this.amount_transferred = amount_transferred;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
