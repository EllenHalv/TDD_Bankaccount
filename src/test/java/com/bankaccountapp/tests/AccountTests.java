package com.bankaccountapp.tests;

import com.bankaccountapp.bank.Account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Tests for the {@link Account} class.
 */
public class AccountTests {

    /**
     * The account number.
     */
    private static final String ACCOUNT_NUMBER = "123456789";
    /**
     * The initial cash amount.
     */
    private static final double INITIAL_CASH = 99999.99;
    /**
     * The negative amount.
     */
    private static final double NEGATIVE_AMOUNT = -1.0;
    /**
     * The null amount.
     */
    private static final Double NULL_AMOUNT = null;
    /**
     * The zero amount.
     */
    private static final double ZERO_AMOUNT = 0.0;
    /**
     * The insufficient balance amount.
     */
    private static final double INSUFFICIENT_BALANCE_AMOUNT = 200000.00;

    /**
     * Test: deposit with a negative amount should throw an exception.
     */
    @Test
    void depositWithNegativeAmountShouldThrowException() {
        Account sut = new Account(ACCOUNT_NUMBER, INITIAL_CASH);

        assertThrows(IllegalArgumentException.class,
                () -> sut.deposit(NEGATIVE_AMOUNT));
    }

    /**
     * Test: deposit with a null amount should throw an exception.
     */
    @Test
    void depositIsNullShouldThrowException() {
        Account sut = new Account(ACCOUNT_NUMBER, INITIAL_CASH);

        assertThrows(IllegalArgumentException.class,
                () -> sut.deposit(NULL_AMOUNT));
    }

    /**
     * Test: deposit with a zero amount should throw an exception.
     */
    @Test
    void depositIsZeroShouldThrowException() {
        Account sut = new Account(ACCOUNT_NUMBER, INITIAL_CASH);

        assertThrows(IllegalArgumentException.class,
                () -> sut.deposit(ZERO_AMOUNT));
    }

    /**
     * Test: withdraw with a negative amount should throw an exception.
     */
    @Test
    void withdrawWithNegativeAmountShouldThrowException() {
        Account sut = new Account(ACCOUNT_NUMBER, INITIAL_CASH);

        assertThrows(IllegalArgumentException.class,
                () -> sut.withdraw(NEGATIVE_AMOUNT));
    }

    /**
     * Test: withdraw with a zero amount should throw an exception.
     */
    @Test
    void withdrawIsZeroShouldThrowException() {
        Account sut = new Account(ACCOUNT_NUMBER, INITIAL_CASH);

        assertThrows(IllegalArgumentException.class,
                () -> sut.withdraw(ZERO_AMOUNT));
    }

    /**
     * Test: withdraw with a null amount should throw an exception.
     */
    @Test
    void withdrawIsNullShouldThrowException() {
        Account sut = new Account(ACCOUNT_NUMBER, INITIAL_CASH);

        assertThrows(IllegalArgumentException.class,
                () -> sut.withdraw(NULL_AMOUNT));
    }

    /**
     * Test: withdraw with insufficient balance should throw an exception.
     */
    @Test
    void withdrawWithInsufficientBalanceShouldThrowException() {
        Account sut = new Account(ACCOUNT_NUMBER, INITIAL_CASH);

        assertThrows(IllegalArgumentException.class,
                () -> sut.withdraw(INSUFFICIENT_BALANCE_AMOUNT));
    }
}
