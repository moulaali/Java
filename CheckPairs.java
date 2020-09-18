/*
	Author : Shaik Faizan Roshan Ali
	Email : alsahercoder@gmail.com
	Date : 15-sep-2020
	This program check for all the pair that sum upto a given number.	
*/
import java.util.*;

class CheckPairs {
	public static void main (String[] args) {
		
	Scanner sumInput = new Scanner(System.in);
        int[] checkArray = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Enter the sum value you want the pair to be : ");
        int checkSum = sumInput.nextInt();
        
        checkPairs(checkArray, checkSum);
        
    }
    
    public static void checkPairs(int arr[], int sum) {
        
        for ( int firstIndex =0; firstIndex < arr.length - 1; firstIndex++ ) {
            
            for (int secondIndex = firstIndex + 1; secondIndex < arr.length; secondIndex++) {
            
                if ( sum == arr[firstIndex] + arr[secondIndex] ) {
                
			System.out.println("The pair of number that make up the sum " + sum + " are " + arr[firstIndex] + " & "+ arr[secondIndex] );
				
		}
				
                else
                    continue;
            }
        }
    }
}
