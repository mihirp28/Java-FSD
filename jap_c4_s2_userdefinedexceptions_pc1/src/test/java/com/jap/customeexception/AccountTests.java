package com.jap.customeexception;

import com.jap.customexception.Account;
import com.jap.customexception.InsufficientFundException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class AccountTests {


    private static final String MESSAGE_ONE = "Withdraw with valid amount should return the new balance";
    private static final String MESSAGE_TWO = "Withdrawing amount greater than balance should throw InsufficientFundsException";
    private Account account;

    @BeforeEach
    public void setUp() {
        account = new Account(5000);
    }

    @AfterEach
    public void tearDown() {
        account = null;
    }



    @Test
    public void givenValidWithdrawAmountThenReturnNewBalance() throws InsufficientFundException {
        double newBalance = account.withdraw(500);
        assertEquals(4500, newBalance, MESSAGE_ONE);
    }

    @Test
    public void givenZeroWithdrawAmountThenReturnSameBalance() throws InsufficientFundException {
        double newBalance = account.withdraw(0);
        assertEquals(5000, newBalance, MESSAGE_ONE);
    }


// Testing by withdrawing amount equal to account balance, should throw InsufficientFundException

    @Test
    public void givenWithdrawAmountGreaterThanBalanceThenThrowsInsufficientFundException() throws InsufficientFundException {
        assertThrows(InsufficientFundException.class, () -> account.withdraw(150000), MESSAGE_TWO);
    }
}
