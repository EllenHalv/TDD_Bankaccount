package com.bankaccountapp.tests;

import com.bankaccountapp.bank.Account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {
    private static final String ACCOUNT_NUMBER = "123456789";
    private static final double INITIAL_CASH = 99999.99;
    private static final double NEGATIVE_AMOUNT = -1.0;
    private static final Double NULL_AMOUNT = null;
    private static final double ZERO_AMOUNT = 0.0;
    private static final double INSUFFICIENT_BALANCE_AMOUNT = 200000.00;

    @Test
    void depositWithNegativeAmountShouldThrowException() {
        Account sut = new Account(ACCOUNT_NUMBER, INITIAL_CASH);

        assertThrows(IllegalArgumentException.class,
                () -> sut.deposit(NEGATIVE_AMOUNT));
    }

    @Test
    void depositIsNullShouldThrowException() {
        Account sut = new Account(ACCOUNT_NUMBER, INITIAL_CASH);

        assertThrows(IllegalArgumentException.class,
                () -> sut.deposit(NULL_AMOUNT));
    }

    @Test
    void depositIsZeroShouldThrowException() {
        Account sut = new Account(ACCOUNT_NUMBER, INITIAL_CASH);

        assertThrows(IllegalArgumentException.class,
                () -> sut.deposit(ZERO_AMOUNT));
    }

    @Test
    void withdrawWithNegativeAmountShouldThrowException() {
        Account sut = new Account(ACCOUNT_NUMBER, INITIAL_CASH);

        assertThrows(IllegalArgumentException.class,
                () -> sut.withdraw(NEGATIVE_AMOUNT));
    }

    @Test
    void withdrawIsZeroShouldThrowException() {
        Account sut = new Account(ACCOUNT_NUMBER, INITIAL_CASH);

        assertThrows(IllegalArgumentException.class,
                () -> sut.withdraw(ZERO_AMOUNT));
    }

    @Test
    void withdrawIsNullShouldThrowException() {
        Account sut = new Account(ACCOUNT_NUMBER, INITIAL_CASH);

        assertThrows(IllegalArgumentException.class,
                () -> sut.withdraw(NULL_AMOUNT));
    }

    @Test
    void withdrawWithInsufficientBalanceShouldThrowException() {
        Account sut = new Account(ACCOUNT_NUMBER, INITIAL_CASH);

        assertThrows(IllegalArgumentException.class,
                () -> sut.withdraw(INSUFFICIENT_BALANCE_AMOUNT));
    }
}
