package com.bankaccountapp.bank;

public final class Account {

    private String accountNr;
    private double initialCash;

    public Account(final String accountNr, final double initialCash) {
        this.accountNr = accountNr;
        this.initialCash = initialCash;
    }

    public String getAccountNr() {
        return accountNr;
    }

    public void setAccountNr(final String accNr) {
        this.accountNr = accNr;
    }

    public double getInitialCash() {
        return initialCash;
    }

    public void setInitialCash(final double initialCash) {
        this.initialCash = initialCash;
    }

    public double getBalance() {
        return initialCash;
    }

    public void deposit(final Double amount) {
        if (checkAmount(amount) == 0.0) {
            throw new IllegalArgumentException("Amount must be over 0.");
        } else {
            initialCash += amount;
        }
    }

    public void withdraw(final Double amount) {
        if (checkAmount(amount) == 0.0 || checkAmount(amount) > initialCash) {
            throw new IllegalArgumentException("Amount must be greater than balance.");
        } else {
            initialCash -= amount;
        }
    }

    public Double checkAmount(final Double amount) {
        if (amount == null || amount <= 0.0) {
            return 0.0;
        } else {
            return amount;
        }
    }
}
