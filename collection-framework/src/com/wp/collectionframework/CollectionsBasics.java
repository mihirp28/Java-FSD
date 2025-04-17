package com.wp.collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CollectionsBasics {

	public static void main(String[] args) {
		List<Object> items = new LinkedList<>();
		items.add(100);
		items.add("Rahul");
		items.add(true);
		items.add(0,29.54);
		items.add("Rahul");
		items.add("Rahul");
		items.add(100);
		
		// For Java 11 and above
//		for(var item:items) {
//			System.out.println(item);
//		}
		
		items.remove(3);
		items.remove((Object)100);
		items.remove("Rahul");
		
		for(Object item:items) {
			System.out.println(item);
		}
		
		
	}
	
}
