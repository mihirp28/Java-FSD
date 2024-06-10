package com.jap.textanalyzer;

public class Word {
	// Declare String word and int number of occurences of the word
	private String word;
	private int noOfOccurrences;
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	
	public int getNoOfOccurrences() {
		return noOfOccurrences;
	}
	public void setNoOfOccurrences(int noOfOccurrences) {
		this.noOfOccurrences = noOfOccurrences;
	}
	
	@Override
	public String toString() {
		return "Word [word=" + word + ", noOfOccurrences=" + noOfOccurrences + "]";
	}
	public Word() {
		
	}
	public Word(String word) {
		this.word = word;
	}
	
	public Word(String word, int noOfOccurrences) {
		this.word = word;
		this.noOfOccurrences = noOfOccurrences;
	}
	// Define a parameterized constructor
	
	// Define getter/setter methods
	



}