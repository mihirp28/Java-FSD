package com.jap.averageofintegers;


public class AverageAge
{
    //This function calculates the average age, takes as input the raw data array
    // handle the exception appropriately
    public String averageAgeCalculator(String[] ageRawData){
    	try{
    	int []sum=new int[ageRawData.length] ;
    	int sumArray =0;
    	for (int i=0;i<ageRawData.length;i++)
    	{
        	sum[i]=Integer.parseInt(ageRawData[i]);

    }
    	int sumLength =sum.length;
    	for (int n:sum) {
    		sumArray=sumArray+n;
    	}
		float avg=(float)sumArray/sumLength;
//		System.out.println(sumArray);
//		System.out.println(sumLength);
//		System.out.println(avg);
    	String finalValue="";
    	finalValue=finalValue+avg;
        return finalValue;
    	}
    	catch(NumberFormatException e) {
    		 String message = e. toString();
    		 return message;
}
    	

}

}
