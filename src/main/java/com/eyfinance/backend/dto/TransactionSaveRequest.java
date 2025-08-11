package com.eyfinance.backend.dto;

import java.math.BigDecimal;

public class TransactionSaveRequest {

    private BigDecimal amount;
    private String type;
    private String description;

    public TransactionSaveRequest() {
    }

    public TransactionSaveRequest(BigDecimal amount, String type, String description) {
        this.amount = amount;
        this.type = type;
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}