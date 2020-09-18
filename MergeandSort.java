/*
	Author : Shaik Faizan Roshan Ali
	Email : alsahercoder@gmail.com
	Date : 18-sep-2020
	Given two Arrays, Merge the two arrays & output Sorted Array	
*/
import java.util.Arrays;

public class MergeSortedArray {
	public static void main (String[] args) {
		
		int[] array1 = {3, 6, 11};
		int[] array2 = {1, 2, 4, 5, 7, 13, 26};
		
		mergedArray(array1, array2);
		
	}
	
	public static void mergedArray(int inputArray1[], int inputArray2[]) {
	    
	    int arrOne = 0;
		
	    int newArraySize = inputArray2.length + inputArray1.length;
	    int[] mergeArray = new int[ newArraySize ];
	    
      	    /* 
            Personal merge code instead of Java method 
        
	    for ( arrOne = 0; arrOne < inputArray1.length; arrOne++ ) {
	        
	        mergeArray[arrOne] = inputArray1[arrOne];
	    }
	    
	    int oldArrayIndex = 0;
	        
	    for (int arrTwo = arrOne; arrTwo < mergeArray.length; arrTwo++ ) {
	        
	        mergeArray[arrTwo] = inputArray2[oldArrayIndex]; 
	        oldArrayIndex++;
	    }
	    
	    */
	    
	    System.arraycopy(inputArray1, 0, mergeArray, 0, inputArray1.length);
	    System.arraycopy(inputArray2, 0, mergeArray, inputArray1.length, inputArray2.length);

	    bubbleSort(mergeArray);
	 }
	 
    public static void bubbleSort(int inputArray[]) {
    
            //iterates throught the array n time    

        for ( int iteration = 0; iteration < inputArray.length; iteration++ ) { 
    
        //From index 1 and interates whole array, Array length times 
 
            for ( int checkIndex = 1; checkIndex < inputArray.length; checkIndex++) {
    
                // Checks if (index - 1 less than index),  and swaps values

                if( inputArray[checkIndex] < inputArray[checkIndex - 1]) {
    
                    int temp = inputArray[checkIndex];
                    inputArray[checkIndex] = inputArray[checkIndex -1];
                    inputArray[checkIndex - 1] = temp;
                }
                
            }

        }
        
        System.out.println("Merged & Sorted Array : " + Arrays.toString(inputArray));
    }

}
