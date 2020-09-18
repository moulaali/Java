/*
	Author : Shaik Faizan Roshan Ali
	Email : alsahercoder@gmail.com
	Date : 18-sep-2020
	This program returns the longest prefix among two strings.
*/

import java.io.*;

public class GetPrefixOfString {
	public static void main (String[] args) {
		
		String strInput1 = "contradict"; 
	    String strInput2 = "contrapositive";
	       getPrefixLength(strInput1, strInput2);

		
	}
	
	public static void getPrefixLength(String str1, String str2) {
	    
	    int prefixLength = 0;
	    for ( int checkIndex = 0; checkIndex < str1.length(); checkIndex++) {
	        
	        if ( str1.charAt(checkIndex) == str2.charAt(checkIndex) )
	            prefixLength++;
	            
	        else
	            break;
	       
	    }
	    
	    System.out.println("Common prefix length is " + prefixLength);

	}
}
