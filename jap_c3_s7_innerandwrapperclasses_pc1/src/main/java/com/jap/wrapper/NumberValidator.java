package com.jap.wrapper;

public class NumberValidator {

    //validation rules to be written
    public int validateNumber(String str) {
    	for(int i =0;i<str.length();i++) {
    		if(!Character.isDigit(str.charAt(i)))
    			throw new NumberFormatException("Invalid ISBN CODE");
    	}
    	int ans =0;
    	if(str.equals(null)||str.length()==0) {
      return -1;
    }
    	for(int i=str.length(); i>=1;i--)
    	{
    		ans+=(int)str.charAt(i-1)*i;
    	}		
    if(ans%11==0 && str.length()==10)
    	return 1;
    return 0;
    }
}
