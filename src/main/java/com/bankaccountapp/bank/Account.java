package com.bankaccountapp.bank;

public class Account {

    private String accountNr;
    private double initialCash;

    public Account(String accountNr, double initialCash) {
        this.accountNr = accountNr;
        this.initialCash = initialCash;
    }

    public String getAccountNr() {
        return accountNr;
    }

    public void setAccountNr(String accountNr) {
        this.accountNr = accountNr;
    }

    public double getInitialCash() {
        return initialCash;
    }

    public void setInitialCash(double initialCash) {
        this.initialCash = initialCash;
    }

    public double getBalance() {
        return initialCash;
    }

    public void deposit(Double amount) {
        if (checkAmount(amount) == 0.0) {
            throw new IllegalArgumentException("Amount must be over 0.");
        } else {
        initialCash += amount;
        }
    }

    public void withdraw(Double amount) {
        if (checkAmount(amount) == 0.0 || checkAmount(amount) > initialCash) {
            throw new IllegalArgumentException("Amount must be greater than balance.");
        } else {
        initialCash -= amount;
        }
    }

    public Double checkAmount(Double amount) {
        if (amount == null) {
            return 0.0;
        }
        if (amount <= 0.0) {
            return 0.0;
        } else {
            return amount;
        }
    }
}
