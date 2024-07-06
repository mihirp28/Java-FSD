package com.jap.calculator;

public class MathematicalCalculator {

	public double add(double a, double b)
	{	
		return a+b;
	}
	public double subtract(double a, double b)
	{	
		return a-b;
	}
	public double multiply(double a, double b)
	{	
		return a*b;
	}
	public int divide(int a, int b)
	{	
		//handle exception scenario here
		double c=0;
		try {
		c=a/b;
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		return (int)c;
	}
	public double modulo(double a, double b)
	{	
		return a%b;
	}
}
