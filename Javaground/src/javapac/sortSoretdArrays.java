package javapac;

import java.util.HashMap;
import java.util.Map.Entry;

public class sortSoretdArrays {

	public static void main(String[] args) {
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = {4,5,6,7,8};
		int[] arr1 = {9,3,1,8,6,2};
		int[] arr2 = {1,3,9,6,2,8};
		int len1 = arr1.length; 
		int len2 = arr2.length;
		int len3 = len1 + len2;
		int temp;
		for (int i = 0 ; i < len1; i++) {
			for (int j = 1 ; j < (len1 - i) ;j++) {
				if(arr1[j] < arr1[j-1]) {
					temp = arr1[j];
					arr1[j] = arr1[j-1];
					arr1[j-1] = temp;
					
				}
			}
			
		}

		
		for (int i = 0; i < len2 ; i++) {
			for (int j = 1; j < (len2-i); j++) {
				if(arr2[j] < arr2[j-1]) {
					temp = arr2[j];
					arr2[j] = arr2[j-1];
					arr2[j-1] = temp;
					
				}
			}
		}
		

		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		for (int i=0 ; i < len1; i++) {
			hm.put(arr1[i], i);
		}
		for (int i=0 ; i < len2; i++) {
			hm.put(arr2[i], i);
		}
		
		int hlen = hm.size();
		int[] arr3 = new int[hlen];
		int x = 0;
		for (Entry<Integer, Integer> entry: hm.entrySet()) {
			int hold = entry.getKey();
	    	   System.out.println( entry.getKey() ); 
	    	   arr3[x] = hold;
	    	   x++;
		}
		System.out.println("----------------------------");
		for (int i = 0 ; i < hlen; i++) {
			System.out.println(arr3[i]);
		}
		
		
		


	}

}
