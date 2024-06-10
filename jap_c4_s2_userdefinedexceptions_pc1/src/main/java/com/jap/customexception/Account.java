package com.jap.customexception;

public class Account {

    private double accountBalance;

    public Account() {

    }

    public Account(double accountBalance) {
this.accountBalance=accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * This method returns the new balance deducting the withdraw amount from the balance
     * Throws InsufficientFundException when amount to withdraw is greater than the balance
     * @throws InsufficientFundException

     */
    public double withdraw(double amount) throws InsufficientFundException {
    	if (accountBalance>=amount) {
    		return (accountBalance-amount);
        	}
    	else
    	 throw new InsufficientFundException("Withdrawing amount greater than balance should throw InsufficientFundsException");
    }
}
