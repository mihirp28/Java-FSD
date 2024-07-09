package com.stackroute.oops;

/*
	This is utility class for
	- Temperature conversion from fahrenheit To Celcius
	- Getting level based on the sum of the elements in an array
 */
public class Utility {

	/*Converts fahrenheit to celcius and returns an int rounded to the nearest integer*/
	public static int fahrenheitToCelcius(int farhenheit) {
		 double result=(5/9.0F)*(farhenheit-32.0);
			return (int)Math.round(result);	}

	/*Converts fahrenheit to celcius and returns a double*/
	public static double fahrenheitToCelcius(double farhenheit) {
		double result=(5/9.0f)*(farhenheit-32.0);
		return result;	}

	/*
	* Sum the elements of the given array and return level based on the sum
	* */
	public static String getLevel(int[] array) {

		 int result=0;
			for(int i:array)
			result=result+i;
			if(result<70)
			return "LOW";
			else if(result>=70 && result<100)
			return "MEDIUM";
			else 
			return "HIGH";	}

}