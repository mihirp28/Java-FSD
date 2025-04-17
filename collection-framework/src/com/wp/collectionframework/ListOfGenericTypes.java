package com.wp.collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListOfGenericTypes {

	public static void main(String[] args) {
		
		List<Integer> items = Arrays.asList(10,14,20,3,5,8);
		
//		for(int item:items) {
//			System.out.println(item);
//		}
		
		items.forEach(item -> System.out.println(item));
		
//		System.out.println("Before Sorting : ");
//		System.out.println(items);
//		
//		System.out.println("After Sorting : ");
//		Collections.sort(items);
//	//  items.forEach(item->System.out.println(item));
//		
//		ListIterator<Integer> itr = items.listIterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			
//		}
//		
//		System.out.println("Size of list = "+items.size());
		
		
		
		
	}
	
}
