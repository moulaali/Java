

import java.util.*;

public class RearrangeBinary {
    public static void main(String args[]) {
        
        int[] binArray = {0, 1, 0, 1, 1, 1, 0};
        
        rearrangeBin(binArray);
    
    }
    
    public static void rearrangeBin(int rearrangeArray[]) {
        
        int checkIndex = 0;
        int swapIndex = rearrangeArray.length - checkIndex -1;
        
        for ( checkIndex = 0; checkIndex < rearrangeArray.length/2; checkIndex++ ) {
            
            if ( rearrangeArray[checkIndex] == 1 ) {
                
                rearrangeArray[checkIndex] = rearrangeArray[checkIndex] + rearrangeArray[swapIndex];
                rearrangeArray[swapIndex] = rearrangeArray[checkIndex] - rearrangeArray[swapIndex];
                rearrangeArray[checkIndex] = rearrangeArray[checkIndex] - rearrangeArray[swapIndex];
                
                swapIndex--;
            }
        }   
        
        System.out.println(Arrays.toString(rearrangeArray));
    }
}
