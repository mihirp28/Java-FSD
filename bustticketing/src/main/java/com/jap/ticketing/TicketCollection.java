package com.jap.ticketing;

import java.util.List;

public interface TicketCollection {
   // define the abstract method for calculating total collection amount
	double getTotal(List<TicketingData> data);
}
