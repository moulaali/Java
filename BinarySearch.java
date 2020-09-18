import java.util.*;

public class BinarySearch {
    
    public static void main(String args[]) {
    
	int[] inputArray = { 1, 2, 4, 5, 6, 8, 10, 11, 12, 15};
	int find = 12;
	System.out.println(Arrays.toString(inputArray));
	binarySearch(inputArray, find);

    }

    public static int binarySearch(int searchArray[], int key) {
	    
	int index = -1;
	int lowIndex = 0;
	int highIndex = searchArray.length - 1;
	int mid;
	
	
	while ( lowIndex <= highIndex ) {
	    
	    mid = lowIndex + ( highIndex - lowIndex) / 2;
    
	    if ( key == searchArray[mid] ) {
		index = mid;
		break;
	    }
	    else if ( searchArray[mid] < key ) 
		lowIndex = mid + 1;
	    
	    else if ( searchArray[mid] > key ) 
		highIndex = mid - 1;
	}
	System.out.println("Value " + key + " is found at index " + index);
	return 0;
    }
}
