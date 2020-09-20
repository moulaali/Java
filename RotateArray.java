/*
  Author: Shaik Faizan Roshan Ali
  Email: alsahercoder@gmail.com
  Date: 20-Sep-2020
  This program is used to rotate an array using the Arraycopy method in Java.
*/

import java.util.*;
public class RotateArray{
    
    public static void main(String[] args) {
        
        int[] inputArray= {1, 2, 3, 5, 6, 9, 10};
        int k = 2;
        rotateArray(inputArray, k);
    }
    
    public static void rotateArray(int rotateArr[], int toRotate) {
        
        int[] outputArray = new int[rotateArr.length];
        int copyLength = rotateArr.length - toRotate;
        
        System.arraycopy( rotateArr, 0, outputArray, toRotate, copyLength );
        System.arraycopy( rotateArr, rotateArr.length - toRotate, outputArray, 0, toRotate );
        
        System.out.println(Arrays.toString(outputArray));
    }
    
}
