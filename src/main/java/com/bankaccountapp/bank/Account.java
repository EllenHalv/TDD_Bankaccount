package com.bankaccountapp.bank;

/**
 * This is a sample class representing a bank account.
 */
public final class Account {

    /**
     * The account number.
     */
    private String accountNr;
    /**
     * The initial cash amount.
     */
    private double initialCash;

    /**
     * Constructs an Account with the specified account number and initial cash.
     *
     * @param accountNr   The account number.
     * @param initialCash The initial cash amount.
     */
    public Account(final String accountNr, final double initialCash) {
        this.accountNr = accountNr;
        this.initialCash = initialCash;
    }

    /**
     * Gets the account number.
     *
     * @return The account number.
     */
    public String getAccountNr() {
        return accountNr;
    }

    /**
     * Sets the account number.
     *
     * @param accountNr The account number to set.
     */
    public void setAccountNr(final String accountNr) {
        this.accountNr = accountNr;
    }

    /**
     * Gets the initial cash amount.
     *
     * @return The initial cash amount.
     */
    public double getInitialCash() {
        return initialCash;
    }

    /**
     * Sets the initial cash amount.
     *
     * @param initialCash The initial cash amount to set.
     */
    public void setInitialCash(final double initialCash) {
        this.initialCash = initialCash;
    }

    /**
     * Gets the current balance.
     *
     * @return The current balance.
     */
    public double getBalance() {
        return initialCash;
    }

    /**
     * Deposits a specified amount into the account.
     *
     * @param amount The amount to deposit.
     */
    public void deposit(final Double amount) {
        if (checkAmount(amount) == 0.0) {
            throw new IllegalArgumentException("Amount must be over 0.");
        } else {
            initialCash += amount;
        }
    }

    /**
     * Withdraws a specified amount from the account.
     *
     * @param amount The amount to withdraw.
     */
    public void withdraw(final Double amount) {
        if (checkAmount(amount) == 0.0 || checkAmount(amount) > initialCash) {
            throw new IllegalArgumentException("Amount must be greater than balance.");
        } else {
            initialCash -= amount;
        }
    }

    /**
     * Checks if the given amount is valid.
     *
     * @param amount The amount to check.
     * @return The valid amount.
     */
    public Double checkAmount(final Double amount) {
        if (amount == null || amount <= 0.0) {
            return 0.0;
        } else {
            return amount;
        }
    }
}
