package revisePac;

import java.io.*;

class PairSum
{
	//public static void getPairsCount(int[] arr, int sum)
//    {
// 
//        int count = 0;// Initialize result
// 
//        // Consider all possible pairs and check their sums
//        for (int i = 0; i < arr.length; i++)
//            for (int j = i + 1; j < arr.length; j++)
//                if ((arr[i] + arr[j]) == sum)
//                	System.out.println("{ "+ arr[i] + "," + arr[j] +" }");
//                    count++;
// 
//        System.out.printf("Count of pairs is %d",count);
//    }
    public static void main (String[] args)
    {
    	{
            int[] arr = {5,6,0,-1,7,3,2,-2};
        	int sum = 5;
            getpairs(arr, sum);
        }
    		
    }
	public static void getpairs(int[] arr, int sum) {
		int len = arr.length;
		for (int i = 0 ; i < len; i++ ) {
			for (int j = i+1; j < len ; j++) {
				if(arr[i] + arr[j] == sum ) {
					System.out.println("[ "+arr[i]+" , "+arr[j] + " ]");
				}
			}
		}
	}
}