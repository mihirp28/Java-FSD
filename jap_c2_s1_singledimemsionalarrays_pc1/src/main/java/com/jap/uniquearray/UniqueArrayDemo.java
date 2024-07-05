package com.jap.uniquearray;



public class UniqueArrayDemo {

    public static void main(String[] aa) {

        //declare and initialize integer Array in numberArray Variable

        int [] numberArray = null;
        UniqueArrayDemo uniqueArrayDemo = new UniqueArrayDemo();
        boolean result = uniqueArrayDemo.getUniqueArrayElement(numberArray);
        System.out.println(result);


    }


    public boolean getUniqueArrayElement(int numberArray[])
    {
    	boolean result= false; 

    	for(int i=0; i<(numberArray.length)-1; i++)
    	{
    		for(int j=i+1; j<=(numberArray.length)-1; j++)
    		{
    			if(numberArray[i] == numberArray[j])
    			{
    				System.out.println("i-"+i+" j- "+j+ " array[i] array[j] values " +numberArray[i]+ " equals" +numberArray[j]);
    				result= false; 
    				return result;
    			}
    			else
    			{
    				System.out.println("i-"+i+" j- "+j+ " array[i] array[j] values " +numberArray[i]+" not equal " +numberArray[j]);
    				result= true;
    			}

    		}
    	}
    	return result;
    }
 }
