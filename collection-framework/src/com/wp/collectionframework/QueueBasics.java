package com.wp.collectionframework;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueBasics {

	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<>();
		
		queue.add("Umesh");
		queue.add("Karan");
		queue.add("Javed");
		queue.add("Anil");
		queue.add("Anil");
		queue.add("Anil");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		

	}

}
