/*
        Author : Shaik Faizan Roshan Ali
        Email : alsahercoder@gmail.com
        Date : 14-sep-2020
        
        Calculate Simple Moving Average (SMA) from an Array
*/

import java.util.*;

class SimpleMovingAverage {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        float[] inputArray={10, 12, 14, 16, 13, 12, 11, 12, 9, 13};
        System.out.println("Enter Window Size and Start Date");
        int windowSize =  input.nextInt();
        int dateIndex = input.nextInt();
        dateIndex--;

        SMA(inputArray, windowSize, dateIndex);
    }

    public static void SMA(float checkArray[], int userWindowSize, int startDateIndex) {

        System.out.print("The simple moving averages are: ");
        for ( int dayNumber = 1; dayNumber <= userWindowSize; dayNumber++ ) {
            int count = 1;
            float sum = 0;
            float avg = 0;
            for( int checkIndex = startDateIndex + userWindowSize - 1; checkIndex >= startDateIndex && count <= dayNumber; checkIndex-- ) {
                sum+=checkArray[checkIndex];
                count++;
            }

            avg = sum / dayNumber;
            System.out.print(avg + ", " );
        }
    }
}
