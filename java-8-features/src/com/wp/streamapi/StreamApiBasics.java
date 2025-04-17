package com.wp.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamApiBasics {

	public List<Integer> getEvens(List<Integer> list){
		List<Integer> evens = new ArrayList<>();
		for(int num:list) {
			if(num%2==0) {
				evens.add(num);
			}
		}
		return evens;
	} 
	
	public List<Integer> getSquares(List<Integer> list){
		List<Integer> squares = new ArrayList<>();
		for(int num:list) {
			squares.add(num*num);
		}
		return squares;
	} 
	
	
	public int getSum(List<Integer> list) {
		int sum =0;
		for(int num:list) {
			sum+=num;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(10,2,5,3,4,7);
		
		
//		StreamApiBasics obj = new StreamApiBasics();
//		// find all the even numbers from the list
//		List<Integer> evens = obj.getEvens(list);
//		
//		// make the square of the even numbers
//		List<Integer> squares = obj.getSquares(evens);
//		
//		// add all the squared numbers and return the sum
//		int sum = obj.getSum(squares);
		
//		System.out.println(sum);
		
		int sum = list.stream().filter(num->num%2==0).map(num->num*num).reduce((num,s)->num+s).get();
		
	}
	
}
