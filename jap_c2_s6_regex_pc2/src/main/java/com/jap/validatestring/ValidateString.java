package com.jap.validatestring;

public class ValidateString {
    public static void main(String[] args) {
        String str = "Julia_21";

        ValidateString validateString = new ValidateString();
        // Call method to check if input string is valid or not
        if (!validateString.validatePassword(str)) {
            System.out.println("Invalid Password");
        } else {
            System.out.println("Valid Password!");
        }
    }

    // Function to validate username based on the specified rules
    public boolean validatePassword(String str) {
       if(str==null)
    	return false;
       if((str.length()<8)||str.length()>=20)
    	   return false;
       if ( isdigit( str.charAt(0) ) || str.charAt(0)=='_')
       { return false;
       }
       for (int i=0;i<str.length(); i++) {
    	   if(isdigit(str.charAt(i))) {}
    	   else if(is_Letter(str.charAt(i))) {}
    	   else if(str.charAt(i)== '_') {}
    	   else {return false;}
       }
    return true;
    }

	private boolean is_Letter(char ch) {
		// TODO Auto-generated method stub
		ch=Character.toUpperCase(ch);
		return (ch>='A'&& ch<='Z');
	}

	private boolean isdigit(char charAt) {
		// TODO Auto-generated method stub
		return (charAt>='0'&&charAt<='9');
	}

}
