package com.jap.integerswap;

import java.util.Scanner;

public class SwapIntegers {

    public static void main(String[] args) {

        SwapIntegers swapIntegers = new SwapIntegers();
            // Declare a scanner object here
        	Scanner sc = new Scanner(System.in);
            // Get the number value as integer from the console and store in variable 'number'
            int number;
           number = sc. nextInt();
            long swappedNumber = swapIntegers.swapNumbers(number);
            System.out.println("Swapped Number is  : "+swappedNumber);
        }

    // Function accepts number and returns result with each pair of digits swapped.
    public long swapNumbers(long number) {
    	 long result = 0;
    	    long m = 1;
    	    
    	    while(number > 0) {
    	        long d1 = number % 10;
    	        number = number/10;
    	        
    	        if(number == 0) {
    	            result = result+ (m * d1);
    	            break;
    	        }
    	        
    	        long d2 = number % 10;
    	        result = result + m * 10 * d1 + m * d2;
    	        number =number/ 10;
    	        m = m*100;
    	    }
    	    
    	    return result;    
    	    }
}
/*
 1234 

d1=4
number = 123
d2=3

result = result + m * 10 * d1 + m * d2;
result =0+1*10*4 + 1*3
      43

number = 12
m=m*100






d1=2
d2=1
number=1

result = result + m * 10 * d1 + m * d2;
result= 43+ 100*10*2 + 100*1
      =2143
 */
