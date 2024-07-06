package com.jap.longestsubstring;

/* Given a string, find the longest substring that appears at both ends of a given StringBuilder*/
public class LongestSubstring {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("playersplay");

        LongestSubstring longestSubstring = new LongestSubstring();
        // Call method to find longest substring that appears at both ends of a string
        System.out.println(longestSubstring.findLongestSubString(str));
    }

    //Function to find the longest substring that appears at both ends of a string
    public StringBuilder findLongestSubString(StringBuilder str) {
    	if(str==null || str.length()==0)
    		return new StringBuilder("Invalid string");
    	 
    	if(str.length()==1)
    		return new StringBuilder(str);
    	
    	 int l = str.length();
    	  String new_str = "";
    	  String tmp = "";
    	  for (int i = 0; i < l; i++) 
    	  {
    	    tmp = tmp+str.charAt(i);
    	    int t_len = tmp.length();
    	    if (i < l / 2 && tmp.equals(str.substring(l-t_len, l ))) {
    	      new_str = tmp;  
    	    }
    	  }
    	  if (new_str.length()==0) {
    		  return new StringBuilder("Longest substring is not present in the given StringBuilder");
    	  } 
    	
    		return new StringBuilder(new_str);
    }
	
}
