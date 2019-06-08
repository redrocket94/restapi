package com.bankapp_backend.restapi;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;
import java.util.Date;

@JsonPropertyOrder({"id", "payerId", "billCollectorId", "billCollectorEmail", "scheduledDate", "value", "active", "isPaid", "autoPay"})

@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long billId;
    Long payerId;
    Long billCollectorId;
    String billCollectorEmail;
    @Temporal(TemporalType.DATE)
    Date scheduledDate;
    double value;
    boolean active;
    boolean isPaid;
    boolean autoPay;


    public Bill() {
    }

    public Long getId() {
        return billId;
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public Date getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(Date scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Long getPayerId() {
        return payerId;
    }

    public void setPayerId(Long payerId) {
        this.payerId = payerId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Long getBillCollectorId() {
        return billCollectorId;
    }

    public void setBillCollectorId(Long billCollectorId) {
        this.billCollectorId = billCollectorId;
    }

    public String getBillCollectorEmail() {
        return billCollectorEmail;
    }

    public void setBillCollectorEmail(String billCollectorEmail) {
        this.billCollectorEmail = billCollectorEmail;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public boolean isAutoPay() {
        return autoPay;
    }

    public void setAutoPay(boolean autoPay) {
        this.autoPay = autoPay;
    }
}