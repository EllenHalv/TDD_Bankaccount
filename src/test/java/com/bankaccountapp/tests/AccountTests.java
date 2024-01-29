package com.bankaccountapp.tests;

import com.bankaccountapp.bank.Account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class AccountTests {

    @Test
    void depositWithNegativeAmountShouldThrowException() {
        Account sut = new Account("123456789", 99999.99);

        assertThrows(IllegalArgumentException.class,
                () -> {
                    sut.deposit(-1.0);
                });
    }

    @Test
    void depositIsNullShouldReturnException() {
        Account sut = new Account("123456789", 99999.99);

        assertThrows(NullPointerException.class,
                () -> {
                    sut.deposit(null);
                });
    }

    @Test
    void depositIsZeroShouldThrowException() {
        Account sut = new Account("123456789", 99999.99);

        assertThrows(IllegalArgumentException.class,
                () -> {
                    sut.deposit(0.0);
                });
    }

    @Test
    void withdrawWithNegativeAmountShouldThrowException() {
        Account sut = new Account("123456789", 99999.99);

        assertThrows(IllegalArgumentException.class,
                () -> {
            sut.withdraw(-1.0);
                });
    }

    @Test
    void withdrawIsZeroShouldThrowException() {
        Account sut = new Account("123456789", 99999.99);

        assertThrows(IllegalArgumentException.class,
                () -> {
                    sut.withdraw(0.0);
                });
    }

    @Test
    void withdrawIsNullShouldThrowException() {
        Account sut = new Account("123456789", 99999.99);

        assertThrows(NullPointerException.class,
                () -> {
            sut.withdraw(null);
                });
    }

    @Test
    void withdrawWithInsufficientBalanceShouldThrowException() {
        Account sut = new Account("123456789", 99999.99);

        assertThrows(IllegalArgumentException.class,
                () -> {
            sut.withdraw(200000.00);
                });
    }
}
