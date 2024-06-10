package com.jap.textanalyzer;

public class Node {
    // declare the Word object and the recursive reference 'next' that the Node of the
    // linked list holds
	Node next;
	Node tail;
	private String word;
    // initialize data value
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public Node() {
		
	}
	
	public Node(String word) {
		this.word = word;
	}

}