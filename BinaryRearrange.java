/*
	Author : Shaik Faizan Roshan Ali
	Email : alsahercoder@gmail.com
	Date : 19-sep-2020
	This program sorts the Binary array in linear time complexity.	
*/

import java.util.*;
    
public class BinaryRearrange {
    
    public static void main(String[] args) {
    
        int[] inputArray = {0, 0, 0, 0};
        
        rearrangeBinary(inputArray);
        
    }
    
    public static void rearrangeBinary(int checkArray[]) {
        
        int length = checkArray.length;
        int ptr1 = 0;
        int ptr2 = length - 1;
        
        while ( ptr1 < ptr2 ) {
            
            if ( checkArray[ptr1] == 1 && checkArray[ptr2] == 0 ) {
                
                int temp = checkArray[ptr1];
                checkArray[ptr1] = checkArray[ptr2];
                checkArray[ptr2] = temp;
                ptr1++;
                ptr2--;
            }
            
            else if ( checkArray[ptr1] == 0 && checkArray[ptr2] == 0 ) {
                
                ptr1++;
            }
            
            else if ( checkArray[ptr1] == 1 && checkArray[ptr2] == 1 ) {
                
                ptr2--;
            }
            
            else if (checkArray[ptr1] == 0 && checkArray[ptr2] == 1 ) {
                
                ptr1++;
                ptr2--;
            }
            
        }
        
        System.out.println("Binary Sorted Array : " + Arrays.toString(checkArray));
    }
}
