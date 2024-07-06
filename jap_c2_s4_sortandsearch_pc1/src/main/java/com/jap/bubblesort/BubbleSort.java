package com.jap.bubblesort;


public class BubbleSort {

    public int sortedDistances(int [] distances,String [] namesOfCities)
    {
        //write the logic to perform bubble sort on the distance
        //swap the namesOfCities also accordingly.
        // return 1 if the sorting is performed
    	for(int i =0;i<distances.length;i++) {
    		int tempNumbers;
    		String tempcities;
    		int flag = 0;
    		for(int j=0;j<distances.length-1-i;j++) {
    			if(distances[j]>distances[j+1]) {
    				tempNumbers = distances[j];
    				tempcities = namesOfCities[j];
    				distances[j] = distances[j+1];
    				namesOfCities[j] = namesOfCities[j+1];
    				distances[j+1] = tempNumbers;
    				namesOfCities[j+1] = tempcities;
    				flag = 1;
    			}
    		}
    		if(flag == 0) {
    			break;
    		}
    	}
    	if(distances[0]<=0) {
    		return 0;
    	}
        return 1;
    }

    public void printArray(int[] distances, String [] cityNames)
    {
        // iterate through the arrays and print the distance and cityNames
    	for(int i=0;i<distances.length;i++) {
    		System.out.print(distances[i]);
    		System.out.print(" "+cityNames[i]);
    		System.out.println(" ");
    	}
    	System.out.println();
    }

    public static void main(String[] args) {
        //Declare the array with city names
        String[] citiesFromZurich = null;
        //Declare the array with distance from Zurich
        int[] distanceFromZurich = null;

        BubbleSort bubbleSort = new BubbleSort();
        
        bubbleSort.sortedDistances(distanceFromZurich,citiesFromZurich);
        bubbleSort.printArray(distanceFromZurich,citiesFromZurich);
       // call the method 'sortedDistances' to sort the arrays based on distance

       // call the method 'printArray' to print the sorted arrays
    }
}