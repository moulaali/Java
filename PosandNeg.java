/*
	Author : Shaik Faizan Roshan Ali
	Email : alsahercoder@gmail.com
	Date : 16-sep-2020
	Arranges array with alternate negative and positive number.
*/

import java.util.*;

public class PosandNeg {
    public static void main(String args[]) {

        int[] inputArray = {1, -1, 2, -7, -4, 5, 6};

        rearrangeArray(inputArray);    
    }

    public static int rearrangeArray(int checkArray[]) {

        Arrays.sort(checkArray);
        int checkIndex = 0;
        int positiveIndex1=0;
        int totalNegatives = 0;
        
        loop:
        for(checkIndex = 0; checkIndex < checkArray.length; checkIndex++ ) {

            if ( checkArray[checkIndex] >= 0 ) {
                positiveIndex1=checkIndex;
                totalNegatives = positiveIndex1;
                break loop;
            }
        }



        for ( int swapIndex = 0; swapIndex <= totalNegatives; swapIndex++ ) {

            if ( swapIndex % 2 == 0 ) {

                checkArray[swapIndex] = checkArray[swapIndex] + checkArray[positiveIndex1];
                checkArray[positiveIndex1] = checkArray[swapIndex] - checkArray[positiveIndex1];
                checkArray[swapIndex] = checkArray[swapIndex] - checkArray[positiveIndex1];
                positiveIndex1 = positiveIndex1 + 2;
            }

            else
                continue;
        }

        System.out.println("Rearranged Array: " + Arrays.toString(checkArray));
        return 0;
    }
}
