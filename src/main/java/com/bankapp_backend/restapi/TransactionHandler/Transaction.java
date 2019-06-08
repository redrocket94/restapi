package com.bankapp_backend.restapi.TransactionHandler;

import com.bankapp_backend.restapi.AccountHandler.Account;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Transaction {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long transactionId;
    private Long senderId;
    private Account.AccountType senderAccountType;
    private Long recipientId;
    private double amountTransferred = 0;
    private Date transactionDate;

    public Transaction() {
    }

    @PrePersist
    protected void onCreate() {
        transactionDate = new Date();
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public Long getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Long recipientId) {
        this.recipientId = recipientId;
    }

    public double getAmountTransferred() {
        return amountTransferred;
    }

    public void setAmountTransferred(double amountTransferred) {
        this.amountTransferred = amountTransferred;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Account.AccountType getSenderAccountType() {
        return senderAccountType;
    }

    public void setSenderAccountType(Account.AccountType senderAccountType) {
        this.senderAccountType = senderAccountType;
    }


}
