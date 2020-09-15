/*
	Author : Shaik Faizan Roshan Ali
	Email : alsahercoder@gmail.com
	Date : 14-sep-2020
	
	This program finds the most frequent occuring element in an array.
*/


import java.util.*;

public class MostFrequentElement {
    public static void main(String[] args) {
    
        int[] arr = {1,1,2,2,2,5,5,5,2,3};
        Arrays.sort(arr);
        int most_frequent = 0;
        int counter = 0, max_value = 0;
        int temp = arr[0];

        // looping through the elements with index values
        for ( int arr_index = 0; arr_index < arr.length - 1; arr_index++ ) { 
    
            if ( temp == arr[arr_index] ) { 
                counter++;

                if ( counter > max_value ) { 
                    max_value = counter;
                    most_frequent = arr_index;
                }
            }
    
            else { 
                counter = 1;
                temp = arr[arr_index + 1]; 
            }
        }
    
    
        System.out.println("Most frequent digit : " + arr[most_frequent] + " Number of times : " + max_value);  
    }   
}
