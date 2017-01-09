package javapac;

public class sortSoretdArrays {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {4,5,6,7,8};
		int len1 = arr1.length; 
		int len2 = arr2.length;
		int len3 = len1 + len2;
		int temp;
		int[] arr3 =  new int[len3];
		int i = 0;
		for( i = 0; i < len1 ; i++) {
			arr3[i] = arr1[i];
		}
		for (int j = 0; j < len2 ; j++) {
			arr3[i] = arr2[j];
			i++;
		}
		
		for (int k = 0 ; k < arr3.length; k++) {
			System.out.print(arr3[k]);
		}
		System.out.println("===========================");
		int x = arr3.length;
		for (i = 0 ; i < x; i++) {
			for (int j = 1 ; j < x - i; j++ ) {
				if (arr3[j-1] < arr3[j]) {
					temp = arr3[j-1];
					arr3[j-1] = arr3[j];
					arr3[j] = temp;
				}
				/*
				if(numbers[j-1] < numbers[j]){
					tempVar = numbers[j-1];
					numbers[j-1] = numbers[j];
					numbers[j] = tempVar;
				 */
				
			}		
			
		}
		
		for (i = 0; i < arr3.length;i++) {
			System.out.print(arr3[i]);
		}

	}

}
