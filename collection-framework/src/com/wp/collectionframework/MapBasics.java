package com.wp.collectionframework;

import java.util.HashMap;
import java.util.Map;

public class MapBasics {

	public static void main(String[] args) {
		
		Map<Integer, String> numsWordMap = new HashMap<>();
		
		// 1 One
		// 2 Two
		
		numsWordMap.put(1, "One");
		numsWordMap.put(2, "Two");
		numsWordMap.put(3, "Three");
		
	
		
		numsWordMap.put(9, "Nine");
		
//		numsWordMap.put(3, "Teen");
		
//		String numsWord = numsWordMap.get(3);
//		
//		System.out.println(numsWord);
		
		for(int number:numsWordMap.keySet()) {
			String word =  numsWordMap.get(number);
			System.out.println(number+" -> "+word);
		}
		
		
		

	}

}
