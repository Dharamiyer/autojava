package javapac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class arrayDuplicates {

	public static void main(String[] args) {
		int[] arr = {2,4,4,5,5,9,7,9,9};
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			if(hm.get(arr[i]) != null) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			}else {
				hm.put(arr[i], 1);
			}

		}
		// Using Keyset and Iterator
		System.out.println("Using Keyset and Iterator" + "/n");
		Iterator<Integer> iter = hm.keySet().iterator();
		while (iter.hasNext()) {
			
			int key = iter.next();
	          System.out.println("dumber " + key + " is repeated " + hm.get(key)+ " times");
		}
		// using keyset without using Iterator
		System.out.println("Using Keyset without Iterator" + "/n");
		for (Integer key :hm.keySet()) {
			 System.out.println("Number " + key + " is repeated " + hm.get(key)+ " times");	
		}
		
		// Using Entryset 
		System.out.println("Using entryset" + "/n");
		for (Entry<Integer, Integer> entry : hm.entrySet()) {
		    Object key = entry.getKey();
		    Object value = entry.getValue();
		    System.out.println("Number " + key + " is repeated " + value+ " times");
		}

	}
	


}


