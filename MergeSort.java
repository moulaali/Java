/*
	Author : Shaik Faizan Roshan Ali
	Email : alsahercoder@gmail.com
	Date : 19-sep-2020
	Given two sorted arrays, merge them into sorted array.
*/

import java.util.*;

public class MergeSort {
    
    public static void main(String args[]) {
        
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6, 8};
        
        mergesort(array1, array2);
    }
    
    public static void mergesort(int arrayOne[], int arrayTwo[]) {
        
        int ptrArray1 = 0;
        int ptrArray2 = 0;
        int length = arrayOne.length + arrayTwo.length;
        int mergeArray[] = new int[length];
        
        for ( int inputIndex = 0; inputIndex < length; inputIndex++ ) {
            
            if( ptrArray1 < arrayOne.length && ptrArray2 < arrayTwo.length ) {
                
                if (arrayOne[ptrArray1] < arrayTwo[ptrArray2] ) {
                    
                    mergeArray[inputIndex] = arrayOne[ptrArray1];
                    ptrArray1++;
                }
                
                else if ( arrayTwo[ptrArray2] < arrayOne[ptrArray1]) {
                    
                    mergeArray[inputIndex] = arrayTwo[ptrArray2];
                    ptrArray2++;
                }
                
            }
            
            else if ( ptrArray1 >= arrayOne.length || ptrArray2 >= arrayTwo.length) {
                
                if ( ptrArray1 >= arrayOne.length) {
                    
                    mergeArray[inputIndex] = arrayTwo[ptrArray2];
                    ptrArray2++;
                }
                
                else if( ptrArray2 >= arrayTwo.length) {
                    
                    mergeArray[inputIndex] = arrayOne[ptrArray1];
                    ptrArray1++;
                }
                
                else
                    break;
            }
        }
        
        System.out.println(Arrays.toString(mergeArray));    
    }
    
}
