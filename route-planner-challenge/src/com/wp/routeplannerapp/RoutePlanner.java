package com.wp.routeplannerapp;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RoutePlanner {
	static boolean path=true;

	List<RouteInfo> routes= new ArrayList<>();
	
	public List<RouteInfo> readRouteInfos()throws IOException {
		FileReader reader = new FileReader("routes.csv");
		String line;
		Scanner scan = new Scanner(reader);
		int index = 0;
		while(scan.hasNextLine()) {
			line=scan.nextLine();
			String []routeInfoString = line.split(",");
			String from = routeInfoString[0].trim();
			String to = routeInfoString[1].trim();
			int distance = Integer.parseInt(routeInfoString[2].trim());
			String duration = routeInfoString[3].trim();
			String airFare = routeInfoString[4].trim();
			RouteInfo route = new RouteInfo(from, to, distance, duration, airFare);
			routes.add(route);
		}
		return routes;
	}
	
	public void displayRouteDetails(List<RouteInfo> routes) {
		System.out.printf("%-20s %-20s %-10s %-10s %-10s \n","From","To","Distance","Duration","Airfare");
		System.out.println("---------------------------------------------------------------------------");
		for(RouteInfo route:routes) {
			System.out.printf("%-20s %-20s %-10d %-10s %-10s \n",route.getFrom(),route.getTo(),route.getDistance(),route.getTravelTime(),route.getAirFare());
		}
	}
	
	
	class ComapreByFlightDestination implements Comparator<RouteInfo>{
		@Override
		public int compare(RouteInfo route1, RouteInfo route2) {
			return route1.getTo().compareToIgnoreCase(route2.getTo());
		}
	}
	
	public List<RouteInfo> sortDirectFlights(List<RouteInfo> directFlights) {
		Comparator<RouteInfo> sortByFlightDest = new ComapreByFlightDestination();
		Collections.sort(directFlights,sortByFlightDest);
		return directFlights;
	}
	
	public List<RouteInfo> showDirectFlights(List<RouteInfo> routes,String fromCity){
		List<RouteInfo> direct = new ArrayList<>();
		for(RouteInfo route:routes) {
			if(route.getFrom().equalsIgnoreCase(fromCity)) {
				direct.add(route);
			}
		}
		return direct;
	}

	static Map<RouteInfo, Boolean> paths = new HashMap<>();
	public static void main(String[] args) throws IOException {
		RoutePlanner obj = new RoutePlanner();
		List<RouteInfo> routes = obj.readRouteInfos();
//		System.out.println("Original Data..");
//		obj.displayRouteDetails(routes);
//		System.out.println();
//		System.out.println("Sorted Data..");
//		List<RouteInfo> sortedRoutes = obj.sortDirectFlights(routes);
//		obj.displayRouteDetails(sortedRoutes);
		
		obj.showAllConnections(routes, "Delhi", "London");
		paths.forEach((k,v)->{
			if(v==true) {
				System.out.println(k);
			}
		});
		
		
	}
	
	 String toCity="";
	
	void showAllConnections(List<RouteInfo> routes, String fromCity, String toCity) {
		
		List<RouteInfo> directs = showDirectFlights(routes, fromCity);
		
		
		for(RouteInfo route:directs) {
			
			
			showAllConnections(routes, route.getTo(), toCity);
			
			
			
			//System.out.println(route);
			
		}
		
		
	}
	
}
