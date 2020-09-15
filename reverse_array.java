/*
	Author : Shaik Faizan Roshan Ali
	Email : alsahercoder@gmail.com
	Date : 14-sep-2020
	
	Print an reverse array.
*/

import java.util.*;

class reverse_array {
	public static void main (String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int rev_arr[];
	   	rev_arr = new int[arr.length];
	   
	   	for ( int rev_arr_index = 0; rev_arr_index <= arr.length-1; rev_arr_index++ ) {
	            
	    	rev_arr[rev_arr_index] = arr[arr.length - 1 - rev_arr_index];          
	   }
	   System.out.println("Reversed array : " + Arrays.toString(rev_arr));
    }
}
