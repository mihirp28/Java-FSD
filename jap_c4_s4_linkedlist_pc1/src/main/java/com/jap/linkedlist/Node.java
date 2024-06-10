package com.jap.linkedlist;

public class Node {

    // Define the data - Song object that goes into the playlist
    private Song data;
    Node next;
	Node prev;
    // Define getter methods
    public Song getData() {
		return data;
	}

	public void setData(Song data) {
		this.data = data;
	}

    // Define recursive data types to hold values of the next and previous nodes in the linked list.
	

    // Define a no-arg constructor
    public Node() {
    	
    }

    
    // Define a parameterized constructor
    
	public Node(Song data) {
		this.data = data;
	}

	

}