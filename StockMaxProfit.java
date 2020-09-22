/* 
	Author : Shaik Faizan Roshan Ali
	Email : alsahercoder@gmail.com
	Date : 23-sep-2020
  	Given an array of stock price find the index to purchase and sell  to maximize the profit in single transaction.
	
*/

class StockMaxProfit {
    
    public static void main(String args[]) {
        
        int[] inputArray = {10, 11, 1, 13, 21, 3};
        
        stockMaxProfit(inputArray);
    }
    
    public static void stockMaxProfit(int[] stockArray) {
        
        int min = stockArray[0];
        int max = 0;
        int maxProfit = 0;
        int minIndex = 0;
        int maxIndex = 0;
        
        for( int arrayIndex = 0; arrayIndex < stockArray.length; arrayIndex++ ) {
            
            if( min > stockArray[arrayIndex] ) {
        
                min = stockArray[arrayIndex];
                minIndex = arrayIndex;  
            }
                
            if( max < stockArray[arrayIndex] && arrayIndex > 0) {

                max = stockArray[arrayIndex];
                maxIndex = arrayIndex;
            }
            
            if ( maxProfit < max - min) {
                maxProfit = max - min;
            }
        } 
        
        System.out.println("Purchase date: " + minIndex + " Purchase Value: " + stockArray[minIndex] );
        System.out.println("Sell date: " + maxIndex + " Sell date: " + stockArray[maxIndex] );
        System.out.println("Maximum profit gained: " + maxProfit);
    }
}
