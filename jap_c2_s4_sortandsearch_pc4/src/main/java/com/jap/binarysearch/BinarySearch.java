package com.jap.binarysearch;


public class BinarySearch {
    // Declare a variable to track the number of comparisons within the array
    static int numberOfComparisons = 0;
    public static void main(String[] args) {

        // Declare arrays cityNames and distances
        // Note that the arrays must be in sorted order
        String cityNames[] = {"Lucerne", "Engelberg", "Basel", "Jungfraujoch", "Murren", "InterLaken", "Grindelwald", "Bern", "Zermatt", "Geneva"};
        int distances[] = {52, 85, 87, 101, 103, 118, 136, 138, 214, 276};

        // Declare the variable with the distance to be searched
        int distanceToBeSearched = 52;

        BinarySearch binarySearch = new BinarySearch();
        // Call the method to search the array
        String result = null;

        // print the result

    }

    // Function to search the city at 52 kms from Zurich
    public String search(int[] distanceArray,String cityNames[], int distanceFromZurich) {
       for (int i=0; i< distanceArray.length ; i++ ) {
    	   if(distanceArray[i]==distanceFromZurich) {
    		   return cityNames[i];
    	   }
     
    }
	   return "City Not Found";
  }
    }
