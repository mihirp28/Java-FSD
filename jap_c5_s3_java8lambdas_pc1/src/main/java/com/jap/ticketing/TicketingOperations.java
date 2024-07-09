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
	public int count(String fileName)
	{
		int recordCount=0;
	    try
		{
			BufferedReader r=new BufferedReader(new FileReader(fileName));
			while(r.readLine()!=null)
			recordCount++;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return recordCount-1;
	}
    public List<TicketingData> readTicketingData(String fileName)
    {
    //This method sorts the data based on the kms travelled by a bus (route)
		List <TicketingData>list=new ArrayList<TicketingData>();
		int count=this.count(fileName);
		try
		{
			BufferedReader read=new BufferedReader(new FileReader(fileName));
			String c=read.readLine();
			for(int i=0;i<count;i++)
			{
				c=read.readLine();
				String[] s=c.split(",");
				list.add(new TicketingData(s[0],s[1],Integer.valueOf(s[2]),Integer.valueOf(s[3]),Integer.valueOf(s[4]),
				      Integer.valueOf(s[5]),s[6],s[7],Integer.parseInt(s[8]),Float.parseFloat(s[9])));
			}
			read.close();
		}
		catch(Exception i)
		{
			i.printStackTrace();
		}
        return list;
    }
	public List<TicketingData> sortByKmsTravelled(List<TicketingData> ticketingDataList)
    {
		Collections.sort(ticketingDataList,(p1,p2)->{
			return Float.compare(p2.getTravelledKM(),p1.getTravelledKM());
		
		});
		return ticketingDataList;
	}

    //This method calculates the total revenue from ticket collection amount
    public double totalAmountCollected(List<TicketingData> ticketingDataList)
    {
		double dm=0;
		for(TicketingData d:ticketingDataList)
		dm+=d.getTotalTicketAmount();
       return dm;
    }
	public static void main(String args[])
	{
		TicketingOperations ticketingOperations;
		List<TicketingData> ticketingDataList;
		final String fileName ="samples.csv";
		ticketingOperations =new TicketingOperations();
		ticketingDataList =ticketingOperations.readTicketingData(fileName);
		System.out.println(ticketingDataList);
		System.out.println(ticketingOperations.totalAmountCollected(ticketingDataList));
	}

}
