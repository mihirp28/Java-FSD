package RoutePlanner;
import java.io.IOException;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class MainClass {
public static void main(String[] args) throws IOException {
	ReadFlightDetails readFlightDetails=new ReadFlightDetails();
	
	List<Route> routes=readFlightDetails.readRecords("route.csv");
	
	
	ListIterator<Route> listr=routes.listIterator();
	System.out.println("Schedule of flights are \n");
	while(listr.hasNext())
	{
		System.out.println(listr.next());
	}
	System.out.println(" \n----------------------------------- ");
	
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the name of source city : ");
	String fromCity=sc.nextLine();
	
	readFlightDetails.showDirectFlights(routes, fromCity);
	readFlightDetails.sortDirectFlights(routes);
	System.out.println("\n -------------------------------");
	System.out.print("Enter the source city\n ");
	String sourceCity=sc.nextLine();
	System.out.println();
	System.out.print("Enter the destination city\n");
	String destinationCity=sc.nextLine();
	readFlightDetails.showDirectSourceToDesti(routes,sourceCity,destinationCity);
	readFlightDetails.showAllConnections(routes,sourceCity,destinationCity);
}
}
