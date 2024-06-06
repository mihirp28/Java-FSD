package com.jap.linearsearch;



public class LinearSearch {
    // Calculates total number of comparisons made while searching a number in an array
    // using linear search algorithm
    static int totalComparisons = 0;

    //This function returns the name of the city that is at a given distance from Zurich.
    //If the city is not found a message is returned instead of the name of the city

    public String findCity(int[] distances,String[] cities, int distanceToSearch)
    {
    	for(int i=0;i<distances.length;i++) {
    		if(distances[i] == distanceToSearch) {
        		return cities[i];
    		}
    	}
    	return "not found";    
    }
    public String[] findCityAtDistanceGreaterThan270(int[] distances,String[] cities, int distanceToSearch)
    {
    	String[] newArr = new String[1];
    	for(int i =0;i<distances.length;i++) {
    		if(distances[i] == distanceToSearch) {
    			newArr[0] = cities[i];
    		}
    	}
    	if(newArr[0]==null) {
    		return new String[]{};
    	}
    	return newArr;    
    	}
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        // Declare the array for cities
        String[] citiesFromZurich = null;
        //Declare the array with distance from Zurich
        int[] distanceFromZurich = null;
        // call the method 'findCity'

        // print the city name that is equal to the distanceToSearch

        // print the number of comparisons within the array until the city is found

        // call the method 'findCityAtDistanceGreaterThan270'

        // print all cities that are greater than 270 kms away from Zurich

    }
}

