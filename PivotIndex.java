/*
	Author : Shaik Faizan Roshan Ali
	Email : alsahercoder@gmail.com
	Date : 20-sep-2020
  Source: https://leetcode.com/problems/find-pivot-index/
	This program pivot for which LHS sum of the pivot is equal to the RHS of the pivot. 	
*/


import java.util.*;

public class PivotIndex {
    
    public static void main(String[] args) {
        
        int[] inputArray = { 4, 5, 1, 2, 3, 6, 6 };
        
        checkPivot(inputArray);
        
    }
    
    public static void checkPivot(int checkArray[]) {
        
        int pivotIndex = 1;
        int pivotIndexValue = checkArray[1];
        int leftPivot = checkArray[0];
        int rightPivot = arraySum(checkArray) - checkArray[0] - pivotIndexValue;

        
        loop:
        for ( pivotIndex = 1; pivotIndex < checkArray.length; pivotIndex++ ) {

            if(rightPivot == leftPivot) {
                
                System.out.println( "The pivot index exist at " + pivotIndex);
                break loop;
            }
                

            else {
                
                leftPivot+= pivotIndexValue;
                rightPivot = rightPivot - checkArray[ pivotIndex + 1 ];
                
                if ( pivotIndex + 1 < checkArray.length)
                    pivotIndexValue = checkArray[pivotIndex + 1];
                continue;
            }
    
        }
        
        System.out.println("-1");
    }
    
    public static int arraySum(int sumArray[]) {
        
        int sum = 0;
        
        for ( int addIndex =  0; addIndex < sumArray.length; addIndex++ ) {
            
            sum += sumArray[addIndex];
        }
    
        return sum;
        
    }
}
