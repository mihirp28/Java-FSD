package com.jap.palindrome;

/* Write a java program to find if any of the words in the list is a palindrome or not, print their count and the palindrome words.*/
public class Palindrome {
    public static void main(String[] args) {
        String[] words = {};
        Palindrome palindrome = new Palindrome();

        // Call method to find palindromes in array of words
        System.out.println("Total number of palindromes: " + palindrome.findPalindromeWords(words));
    }

    // Function to find palindromes in an array of words
    public int findPalindromeWords(String[] words) {
    	int	count=0;

        	for (int i=0; i<words.length;i++){
        		StringBuilder newWord= new StringBuilder() ;
        		String a= words[i];
        		newWord.append(words[i]);
        		newWord.reverse();
        		String b= newWord.toString();
        		if (a.equals(b))
        		{
        			System.out.println(words[i]);
        			count=count+1;
        		}    	
        	}
        	
    	return count;	
    }
}
