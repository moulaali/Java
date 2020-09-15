/*
    Author: Shaik Faizan Roshan Ali
    Email : alsahercoder@gmail.com
    Date : 16-sep-2020
    
    This program finds out the second-highest element in an array.
*/
import java.util.*;

class SecondLargestNumber {

    public static void main (String[] args) {
        
        int[] inputArray = {-9, -8, -2, -1};
        Arrays.sort(inputArray);
        
        secondLargest(inputArray);
    }
    
    public static void secondLargest(int checkArray[]) {
        
        int secondLargestIndex = 0;
        int maxIndexValue = 0;
        for ( int checkIndex = 1; checkIndex < checkArray.length; checkIndex++ ) {
            
            if ( checkArray[maxIndexValue] <= checkArray[checkIndex] ) {
                
                secondLargestIndex = maxIndexValue;
                maxIndexValue = checkIndex;
                
            }
            
            else
                continue;
        }
        
        System.out.println("Second Highest element is value of " + checkArray[secondLargestIndex]);  
    }
}
