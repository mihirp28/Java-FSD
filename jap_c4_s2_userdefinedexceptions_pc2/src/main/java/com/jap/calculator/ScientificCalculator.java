package com.jap.calculator;

public class ScientificCalculator {

	public double cielOfANumber(float num) throws CalculatorException
	{
		if (num<=0)
		throw new CalculatorException("Not allowed");
		else
		return (Math.ceil(num));
	}
	
	public double floorOfANumber(float num) throws CalculatorException
	{
		if (num<=0)
		{throw new CalculatorException("Not allowed");}
		else
		return Math.floor(num);
	}
	
    public long power(int n, int p) throws CalculatorException {
    		if (n<0 || p<0){
    			throw new CalculatorException("Not allwed");
    			}
    		else
    			return ((long)Math.pow(n, p));
    }
    
    public double squareRoot(int n) throws CalculatorException  {	
    	if (n<=0)
	{throw new CalculatorException("not allowed");}
    	else
    	return Math.sqrt(n);
    }
}
