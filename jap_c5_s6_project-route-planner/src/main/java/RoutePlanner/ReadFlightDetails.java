package RoutePlanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ReadFlightDetails {

	// This method reads a file and adds each line of the file into the
	// corresponding SalesRecord object
	public List<Route> readRecords(String fileName) {
		List<Route> flightData = new ArrayList<Route>();
		File file=new File(fileName);
		try {
			Scanner sc=new Scanner(file);
			sc.nextLine();
			while(sc.hasNextLine())
			{
				String [] flightDetails=sc.nextLine().split(",");
				flightData.add(
						new Route(flightDetails[0], flightDetails[1], flightDetails[2], flightDetails[3], flightDetails[4]));
			}


		} catch (IOException e) {
			e.printStackTrace();
		}

		return flightData;
	}

	public static List<Route> available = new ArrayList<Route>();
	public static List<Route> al = new ArrayList<Route>();

	public void showDirectFlights(List<Route> routes, String fromCity) {
		String sourceCity = fromCity;
		List<Route> available = new ArrayList<Route>();

		if (sourceCity.equalsIgnoreCase("Delhi") || sourceCity.equalsIgnoreCase("Los Angeles")
				|| sourceCity.equalsIgnoreCase("Frankfurt") || sourceCity.equals("London")
				|| sourceCity.equals("Sen Fransico") || sourceCity.equals("Mumbai")) {
			System.out.println("The flights available from " + fromCity + " \n");
			for (Route routes1 : routes) {
				if (routes1.getFrom().equals(sourceCity)) {
					// System.out.println(routes1);
					available.add(routes1);
				}
			}
		} else {
System.out.println("Sorry no information available on flights originated from the "+ sourceCity);

		}
		for (Route r : available) {
			System.out.println(r);
		}

		al = available;

	}

	public void sortDirectFlights(List<Route> routes) {

		List<Route> nl = al;
		if (nl.isEmpty()) {
			System.out.println(" There are no flights ");
			return;
		}

		Collections.sort(nl, new Comparator<Route>() {
			public int compare(Route o1, Route o2) {
				return o1.getTo().compareTo(o2.getTo());
			}
		});

		System.out.println(" \n List of flight available after  sorting is  \n");
		Iterator<Route> itr2 = nl.iterator();
		{
			while (itr2.hasNext()) {
				System.out.println(itr2.next());
			}
		}
	}
	public void showDirectSourceToDesti(List<Route> routes, String sourceCity, String desCity) {
		System.out.print(" \n Direct flights are "  );
		int count=0;
		for (Route r : routes) {
			if (r.getFrom().equals(sourceCity) && r.getTo().equals(desCity)) {
				System.out.println(r);
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(" Not available ");
		}
		System.out.println();
	}

	public void showAllConnections(List<Route> routes, String sourceCity, String desCity) {
		List<Route> ls = new ArrayList<Route>();
		
		
		for(int i=0;i<routes.size();i++)
		{
			if(routes.get(i).getFrom().equals(sourceCity))
			{
				
				for(int j=i+1;j<routes.size();j++)
				{
					if(routes.get(i).getTo().equals(routes.get(j).getFrom()))
					{
						if(routes.get(j).getTo().equals(desCity))
						{
							
							ls.add(routes.get(i));	
							ls.add(routes.get(j));
						}
						
						for(int k=j+1;k<routes.size();k++)
						{
					
							if(routes.get(j).getTo().equals(routes.get(k).getFrom()))
								{
								
									if(routes.get(k).getTo().equals(desCity))
									{	ls.add(routes.get(i));	
										
										ls.add(routes.get(j));
										ls.add(routes.get(k));
										
									}
								}
						}
					}
				}
				
			}
		}
		
		if (ls.isEmpty()) {
			System.out.println("There are no connecting  routes avalilable");
			System.out.println(" \n ____________ Thank You _________");
		}
		else
		{
			System.out.println("The connecting flights between "+sourceCity +" and "+desCity +" are  \n \n");
			for (Route r : ls) {
				System.out.println(r);
			}
		}

	}

}
