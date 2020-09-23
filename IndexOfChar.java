/* 
	Author : Shaik Faizan Roshan Ali
	Email : alsahercoder@gmail.com
	Date : 23-sep-2020
  This program searches index of a character in a String value.
*/

import java.util.*;

class indexOf{
    
    public static void main(String args[]) {
        
        String str = "coding in java is cool";
        char[] inputArray = str.toCharArray();
        char search = 'j';
        
        indexOf(inputArray, search);
    }
    
    public static void indexOf(char[] strArray, char searchChar ) {
        
        for ( int index = 0; index < strArray.length && strArray.length != 0; index++ ) {
            
            if( searchChar == strArray[index] ) {
               
                System.out.println("firstIndex " + index);
                return;  
            }
        }
        
        System.out.println("Index doesn't exist");
    }
}
