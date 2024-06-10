package com.jap.textanalyzer;

import java.util.HashMap;
import java.util.Map;

public class LinkedList {
	private Node head;
	private Node tail;

    // This method adds a Word node to the linked list
	
	Map<String, Integer> hashMap = new HashMap<>();
    public boolean addNode(String item) {
    	boolean added = updateOccurance(item);
    	if(added == false) {
    		Node node = new Node(item);
        	node.next = head;
        	head = node;
        	if(tail == null) {
        		tail = head;
        	}
    	}
    	return !added;
    }
    
    // This method checks if a given word occurs in the linked list and returns true of false
    public boolean updateOccurance(String item) {
    	boolean flag = false;
		Integer integer = hashMap.get(item);
		if(integer == null) {
			hashMap.put(item, 1);
		}else {
			flag = true;
			hashMap.put(item, integer+1);
		}
        return flag;
    }

    // This method checks if the list is empty or not
    public boolean isEmpty(){
        return getSize() == 0;
    }

    // This method returns the size of the linked list
    public int getSize()
    {	
    	int size = 0;
    	Node node = head;
    	while(node!=null) {
    		size+=1;
    		node = node.next;
    	}
        return size;
    }

    // This method displays words in descending order of their occurances
    public void showFrequentWords() {
    	
    }
    //This method displays the word list
    public void showWordList(){
    	Node temp = head;
    	while(temp!=null) {
    		System.out.println(temp.getWord());
    		temp = temp.next;
    	}
    	System.out.print("End");
    }
}