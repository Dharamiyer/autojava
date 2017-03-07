import java.io.*;

public class bubbSort {

	public static void main(String[] args) {
		int[] arr = {9,8,8,6,1,4};
		int len = arr.length;
		int temp;
//		for (int i = 0; i < len ; i++ ) {
//			for (int j = 1; j < len -j ; j++) {
//				if(arr[j] < arr[j-1]) {
//					temp = arr[j];
//					arr[j] = arr[j-1];
//					arr[j-1] = temp;	
//				}
//				
//			}
//			
//		}
//		for (int i =0; i < len; i++) {
//			System.out.println(arr[i]);
//		}
		
		for (int i = 0; i < len; i++)
		{
			for(int j = 1; j < (len - i); j++)
			{
				if(arr[j-1] < arr[j]){
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}

		}
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}

		
		
	}

}
