package com.jap.replaceinteger;

public class ArrayPairSum {

    public static void main(String[] aa) {

        //Declare and initialize integer array in the variable numberArray
        int[] numberArray= {2,3,4,5,2,6,12};
        ArrayPairSum arrayPairSum = new ArrayPairSum();
        int sumArray[] = arrayPairSum.sumOfArrayPair(numberArray);
        //write forEach loop to iterate through the 'sumArray' to print the output
for (int a :sumArray)
{
	System.out.println(a);
	}
}

    public int[] sumOfArrayPair(int numberArray[]){
    	int [] arr;
    	int a = numberArray.length;
    	if(a%2!=0){
    		int n= (a/2)+1;
    		int last= numberArray[numberArray.length-1];
    		arr =new int[n] ;
    		arr[n-1]=last;
    		int j=0;
    		for (int i=0; i<=numberArray.length-2;i=i+2){
    			arr[j]= numberArray[i]+numberArray[i+1];	
    			j++;
    			 }
    			
    			}
    		else {
    			int b= (a/2);
    			arr =new int[b];
    			int j=0;
    			
    				for (int i=0; i<=numberArray.length-1;i=i+2) {
    					arr[j]= numberArray[i]+numberArray[i+1];
    					j++;
    			}
    			
    			}
    	return arr;
	}
}
