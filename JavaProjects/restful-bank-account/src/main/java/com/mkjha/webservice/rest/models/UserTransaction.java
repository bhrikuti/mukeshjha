package com.mkjha.webservice.rest.models;

/**
 * @author mkjha
 *
 */
public class UserTransaction {
    
    private double amount;
    
    public UserTransaction() {}
    
    public UserTransaction(double amount) {
    	this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
