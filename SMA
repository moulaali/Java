/*
	Author : Shaik Faizan Roshan Ali
	Email : alsahercoder@gmail.com
	Date : 14-sep-2020
	
	Calculte Simple Moving Average (SMA) from an Array
*/

class simple_moving_avg {
    public static void main (String[] args) {
 
       int[] arr={1, 2, 3, 4, 5, 12, 11, 12, 9, 13};
 
       System.out.print("The simple moving averages are: ");
        for ( float day_num = 1; day_num <= 5; day_num++ ) {
 
            float sum =0;
            float avg =0;        
            for( int i = 0; i < day_num; i++ ) 
                sum+=arr[i];
 
                avg = sum / day_num;
            System.out.print(avg + ", ");
        }    
    }
}
