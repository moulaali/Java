/*  
  Author: Shaik Faizan Roshan Ali
  Email: alsahercoder@gmail.com
  Date: 20-Sep-2020
  This program is used to rotate an array using the reverseArray method.
*/

import java.util.*;
public class RotateArray1{
    
    public static void main(String[] args) {
        
        int[] inputArray= {1, 2, 3, 5, 6, 9, 10};
        int[] outputArray = new int[inputArray.length];
        int toRotate = 2;
        
        int beginIndex = 0;
        int terminateIndex = inputArray.length - toRotate - 1;
        reverseArray(inputArray, beginIndex, terminateIndex);
        
        beginIndex = terminateIndex;
        terminateIndex = inputArray.length - 1;
        reverseArray(inputArray, beginIndex, terminateIndex);
        
        beginIndex = 0;
        terminateIndex = inputArray.length - 1;
        outputArray = reverseArray(inputArray, beginIndex, terminateIndex);
        
        System.out.println(Arrays.toString(outputArray));
        
    }
    
    public static int[] reverseArray(int reverseArr[], int startIndex, int endIndex) {
        
        
        for ( int index = startIndex; index <= endIndex/2; index++ ) {
            
            int temp = reverseArr[index];
            reverseArr[index] = reverseArr[endIndex];
            reverseArr[endIndex] = temp; 
            endIndex--;
        }
        
        return reverseArr;
        
    }
    
}
