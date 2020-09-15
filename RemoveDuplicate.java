import java.util.*;

public class RemoveDuplicate{
    
    public static void main(String []args) {
	
	int[] inputArray = {1, 2, 3, 3, 4, 5, 5, 6};
	
	removeDuplicate(inputArray);
	
    }
    
    public static void removeDuplicate(int duplicateArr[]) {
        
        Arrays.sort(duplicateArr);
        
        ArrayList<Integer> outputArray = new ArrayList<Integer>();
        
        for ( int trueIndex = 0; trueIndex < duplicateArr.length; trueIndex++ ) {

            if ( outputArray.contains(duplicateArr[trueIndex]) == false ) {

                outputArray.add(duplicateArr[trueIndex]);
                    
            }   
        }        
            
        
	   System.out.println("The array with no Duplicate Values : ");
	   
	   for (int printIndex = 0; printIndex < outputArray.size(); printIndex++) { 		      
	          
	          System.out.print(outputArray.get(printIndex) + ", "); 		
	    }   

    }
}
