package com.jap.textanalyzer;

public class Word {

    // The Word class declare the word and the occurance
	private String word;
	private int occurance;

    public Word() {
    }
    
    
    public Word(String word, int occurance) {
		this.word = word;
		this.occurance = occurance;
	}


	public String getWord() {
		return word;
	}


	public void setWord(String word) {
		this.word = word;
	}


	public int getOccurance() {
		return occurance;
	}


	public void setOccurance(int occurance) {
		this.occurance = occurance;
	}


	@Override
	public String toString() {
		return String.format("Word{word=" + "'%s'" + ", wordOccurance=" + occurance + "}", word);
	}


// Declare parameterized constructor and initialize values
// getters and setters

// Override the toString() method in this format Word={word=xxx,wordOccurance=x}


}