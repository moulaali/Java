/*
	Author : Shaik Faizan Roshan Ali
	Email : alsahercoder@gmail.com
	Date : 14-sep-2020
	
	Reverse an array by swapping the values.
*/

import java.util.*;

class reverse_array_v2 {
	public static void main (String[] args) {
		
        int[] arr = {10, 20, 30, 40, 50};
        
        for ( int i = 0; i < arr.length/2; i++ ) {
            
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length -1 -i] = temp;
        }
        
        System.out.println("Reverse arr : " + Arrays.toString(arr));
   }
}
