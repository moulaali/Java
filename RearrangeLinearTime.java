/*
	Author : Shaik Faizan Roshan Ali
	Email : alsahercoder@gmail.com
	Date : 17-sep-2020
	This program rearranges a binary array in linear time.
*/

import java.util.*;

public class RearrangeBinary {
    public static void main(String args[]) {
        
        int[] binArray = {0, 1, 0, 0, 1, 0, 0};
        
        rearrangeBin(binArray);
    
    }
    
    public static void rearrangeBin(int rearrangeArray[]) {
        
        int checkIndex = 0;
        int zeros = 0;
        int ones = 0;
        int zeroEntry = 0;
                
        for ( checkIndex = 0; checkIndex < rearrangeArray.length; checkIndex++) {
            
            if ( rearrangeArray[checkIndex] == 0 )
            zeros++; // 5 
            
            else
            ones++; // 2
        }
        
        for ( zeroEntry = 0; zeroEntry < zeros; zeroEntry++ ) {
            
            rearrangeArray[zeroEntry] = 0;
        }
        
        int oneEntryIndex = zeroEntry;
        for (int oneEntry = 0; oneEntry < ones; oneEntry++) {
            
            rearrangeArray[oneEntryIndex] = 1;
            oneEntryIndex++;
        }
        System.out.println(Arrays.toString(rearrangeArray));
    }
}
