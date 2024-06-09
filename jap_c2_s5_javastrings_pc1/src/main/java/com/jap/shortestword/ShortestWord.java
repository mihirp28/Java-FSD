package com.jap.shortestword;
import java.util.*;

/* "Write a Java program to get the strings as input from the user and push them to an array.
 Find the shortest word in the list of Strings and output the same on screen.*/
public class ShortestWord {
    public static void main(String[] args) {
        // Input number of words in array using scanner
        Scanner sc =new Scanner(System.in);
    	int numberOfWords = sc.nextInt();
        // Input array of words to be compared using scanner
    	System.out.println("Enter words");
        String[] words = new String[numberOfWords];
        for(int i=0;i<numberOfWords;i++) {
        	words[i]= sc.next();
        }
        ShortestWord shortestWord = new ShortestWord();
        // Call the method and display shortest word in array of words
        System.out.println("Shortest word is " + shortestWord.findShortestWord(words));
    }

    // Function to find shortest word in array of words
    public String findShortestWord(String[] words) {
    	if (words.length==0) {
    		return"Cannot find shortest word as array is empty";
    	}
    	String  smallest= words[0];
    	for(int i=0;i<words.length;i++) {
    		
    		if (smallest.length() > words[i].length()){ 
    			 smallest =words[i];
    	
    		}
    	}
        return smallest;
    }
}
