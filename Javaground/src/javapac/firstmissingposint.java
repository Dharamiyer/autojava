package javapac;

public class firstmissingposint {

	public static void main(String[] args) {
//		Given [1,2,0] return 3,
//		and [3,4,-1,1] return 2.
		int[] arr = {1,2,0,5};
		// sort
		int len = arr.length;
		int temp;
		
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
		for (int i=0; i < len; i++) {
			System.out.print(arr[i] +", ");
			
		}
		for (int x = 0; x < len; x ++){
			if (arr[x] > 0){
				if (arr[x+1]-arr[x]>1) {
					
				}
				
				
				
		}
		}
	}
}
		
	
		

	
