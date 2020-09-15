/*
	Author : Shaik Faizan Roshan Ali
	Email : alsahercoder@gmail.com
	Date : 14-sep-2020
	
	Reverse an array by swapping the values.
*/

import java.util.*;

class ReverseArray {
	public static void main (String[] args) {
		
		int[] inputArray = {10, 20, 30, 40, 50};

        PrintReverseArray(inputArray);
        ReverseArrayUsingSwap(inputArray);
    }
    
    public static void PrintReverseArray(int arr[]) {
        
        int reverseArray[];
	   	reverseArray = new int[arr.length];
	   
	   	for ( int reverseArrayIndex = 0; reverseArrayIndex <= arr.length-1; reverseArrayIndex++ ) {
	            
	    	reverseArray[reverseArrayIndex] = arr[arr.length - 1 - reverseArrayIndex];          
	   }
		
	   System.out.println("Reversed array : " + Arrays.toString(reverseArray));
    }
    
    public static void ReverseArrayUsingSwap(int arr[]) {
    
        for ( int i = 0; i < arr.length/2; i++ ) {
            
            arr[i] = arr[i] + arr[arr.length - 1 - i];
            arr[arr.length -1 -i] = arr[i] - arr[arr.length -1 -i];
            arr[i] = arr[i] - arr[arr.length - 1 - i];   
        }
        
        System.out.println("Reverse Array using Swap : " + Arrays.toString(arr));
    } 
}
