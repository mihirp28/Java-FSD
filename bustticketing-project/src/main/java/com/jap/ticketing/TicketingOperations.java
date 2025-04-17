package com.jap.ticketing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TicketingOperations {
    //This method reads the sample.csv file provided and returns a List
    public List<TicketingData> readTicketingData(String fileName)
    {
        return null;
    }
    //This method sorts the data based on the kms travelled by a bus (route)
    public List<TicketingData> sortByKmsTravelled(List<TicketingData> ticketingDataList)
    {
        return null;
    }

    //This method calculates the total revenue from ticket collection amount
    public double totalAmountCollected(List<TicketingData> ticketingDataList)
    {
    	
    	TicketCollection collection=(list)->{
    		double total=0;
    		for(TicketingData data:list) {
    			total+=100; // data.getTicketAmount()
    		}
    		return total;
    	};
    	
       return collection.getTotal(ticketingDataList);
    }

}
