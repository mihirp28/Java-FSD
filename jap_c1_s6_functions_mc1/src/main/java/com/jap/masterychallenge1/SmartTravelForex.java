package com.jap.masterychallenge1;

import java.util.Scanner;

public class SmartTravelForex {
	static double JPY = 0.67;
	static double USD =74.3; 
	static double GBP = 94.5; 
	static double EUR = 85.37;
	static double AED = 20.25;
	
    /**
     * This method converts the given amount in INR to the currency of choice
     * @param amount
     * @param choice
     * @return the exchange rate depending on choice of currency
     */
    public static double currentExchangeRates(double amount, int choice) {
    	double newAmount=0;
    	if (amount<0)
    		return -1;
    	else {
    	switch(choice) {
       case 1:{
     	   newAmount=amount*JPY ;
    	   break;
    	}
       case 2:{
    	   newAmount=amount*EUR ;
    	   break;}
       case 3:{
    	   newAmount=amount*GBP ;
    	   break;}
       case 4:{
    	   newAmount=amount*USD ;
    	   break;}
       case 5:{
    	   newAmount=amount*AED ;
    	   break;}
    	}
        return newAmount;
    }}

    /**
     * This method converts a given source currency to the desired target currency
     * @param sourceCurrency
     * @param targetCurrency
     * @param amountToBeConverted
     * @return converted amount from a source currency to the desired target currency
     */

    public static double convertGivenCurrencyIntoDesiredCurrency(int sourceCurrency, int targetCurrency, double amountToBeConverted) {
    	double amountInd=0;
    	double convertedAmount=0;
    	if(sourceCurrency==targetCurrency)
    		return -1;
    	else {
    	switch(sourceCurrency) {
    	case 1:
    		amountInd = amountToBeConverted*JPY;
    		break;
    	case 2:
    		amountInd = amountToBeConverted*EUR;
    		break;
    	case 3:
    		amountInd = amountToBeConverted*GBP;
    		break;
    	case 4:
    		amountInd = amountToBeConverted*USD;
    		break;
    	case 5:
    		amountInd = amountToBeConverted*AED;
    		break;
           
           }
    	switch(targetCurrency) {
    	case 1:
    		convertedAmount = amountInd/JPY;
    		break;
    	case 2:
    		convertedAmount = amountInd/EUR;
    		break;
    	case 3:
    		convertedAmount = amountInd/GBP;
    		break;
    	case 4:
    		convertedAmount = amountInd/USD;
    		break;
    	case 5:
    		convertedAmount = amountInd/AED;
    		break;
           }
    	return convertedAmount;
    }
    	}

    /**
     *  This method displays the currency conversion rates in a tabular format
     *
     */
    public static void displayForexDetails() {
    	System.out.println("The exchanges rates for each currency (1, 10, 20, 50, 100) in INR ");
    	System.out.println("          1      10     20     50     100");
    	System.out.println("JPY      0.67   6.7    13.4   33.5    67.0");
    	System.out.println("EUR      85.37  853.7 1707.4  4268.5  8537.0");
    	System.out.println("GBP      94.5  954.0  1890.0  4725.0  9450.0");
    	System.out.println("USD      74.3  743.0  1486.0  3715.0  7430.0");
    	System.out.println("AED      20.25  202.5  405.0  1012.5  2025.0");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayForexDetails();
        int source = 0;
        int target = 0;
        double amountToBeConverted = 0;
        System.out.println("Do you wish to check conversion rates today : (y/n) ");
        char choice = sc.next().charAt(0);
        if (choice == 'y') {
            System.out.println("Exchange Rate of currency can be done for \n 1. JPY \n 2. EUR \n 3. GBP \n 4. USD \n 5. AED ");
            System.out.println("Enter the source currency(Currency I have) : ");
            // Accept the source currency 1 for JPY, 2 for EUR, 3 for GBP, 4 for USD, 5 for AED
            source = 0;
            System.out.println("Enter the target currency(Currency I want) : ");
            // Accept the target currency 1 for JPY, 2 for EUR, 3 for GBP, 4 for USD, 5 for AED
            target = 0;
            System.out.println("Enter the amount to be converted : ");
            //Accept the amount to be converted
            amountToBeConverted = 0;
            // Display the amount converted
            System.out.println("The converted exchange rate is : " + convertGivenCurrencyIntoDesiredCurrency(source, target, amountToBeConverted));
        } else {
            System.out.println("Thanks for checking into currency convertor");
        }
    }

}
