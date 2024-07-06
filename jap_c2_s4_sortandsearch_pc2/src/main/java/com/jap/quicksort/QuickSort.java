package com.jap.quicksort;

/* Write a program that stores 10 numbers in an array and sorts them by using the quick sort algorithm.
In addition, the program should also calculate the number of comparisons and the number of data movements.
 */
public class QuickSort {
    // Calculates number of comparisons done while sorting an array using quick sort
    static int numberOfComparisons = 0;
    // Calculates number of swaps while sorting an array using quick sort
    static int numberOfDataMovement = 0;

    public static void main(String[] args) {
        // Declare the array with the distances
        int[] integerArray = {138,52,118,136,85,276,103,87,214,101};
        QuickSort quickSort = new QuickSort();

        // Call method to sort array using quick sort
        int[] sortedArray = null;
        // Display the sorted array
        System.out.println("The sorted distances are : ");

        // Display the numberOfComparisons and numberOfDataMovement
    }

    // Function recursively sorts elements before and after partition
    public int[] sort(int[] arr, int low, int high) {

    	if(arr.length==0) {
    		return new int[]{};
    	}
    	int pi = partition(arr,low,high);
    	if(low<pi-1) {
    		sort(arr,low,pi-1);
    	}
    	if(pi<high) {
    		sort(arr,pi,high);
    	}
    	return arr;
    }

    /* Function takes last element as pivot, places the pivot element at its correct position in sorted array,
    and places all smaller (smaller than pivot) to left of pivot and all greater elements to right of pivot */
    private int partition(int[] arr, int low, int high) {


        int pivot = arr[(low+high)/2];
        while(low<=high) {
        	while(arr[low]<pivot) {
        		low++;
        	}
        	while(arr[high]>pivot) {
        		high--;
        	}
        	if(low<=high) {
        		int temp = arr[low];
        		arr[low] = arr[high];
        		arr[high] = temp;
        		low++;
        		high--;
        	}
        }
        return low;    }

    // Function swaps elements within array
    private void swap(int[] array, int index1, int index2) {
      // write logic to swap the values
    }
}

