/*package whatever //do not write package name here */

import java.util.*;

class searchSubString {
    
    public static void main(String args[]) {
        
        String str1 = "Hello shanghai, I am Roshan";
        String str2 = "osha";
        
        subString(str1, str2);
    }
    
    public static void subString(String mainString, String subString) {
        
        char[] mainStringArray = mainString.toCharArray();
        char[] subStringArray = subString.toCharArray();
    
	int occuredIndex = 0;
   
        if ( subStringArray.length > mainStringArray.length)
	    System.out.println("Not possible");
                   
        for(int index = 0; index < mainStringArray.length - subStringArray.length; index++ ) {
            
            occuredIndex = index;
            
            for ( int subIndex = index; subIndex < subStringArray.length; subIndex ++ ) {
            	
            	int checkIndex = 0;
            	
            	if( subStringArray[checkIndex] == mainStringArray[subIndex] ) {
            		
            		checkIndex++;
            	    
            	}
               
            	else 
            	    break;
            }
            
        }

	System.out.println( "The first occurence of Index " +  occuredIndex );
    }
} 
