package javapac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class hashmap2 {

	public static void main(String[] args) {
		String str = "repeated string repeated words in string max repeated words that are repeatred";
		String delimit = "[ ,.?!+]";
		String[] starr = str.split(delimit);
		HashMap <String, Integer>hm = new HashMap<String, Integer>();
		int len = starr.length;
		for (int i =0 ; i < len ; i++) {
			if (hm.containsKey(starr[i])) {
				hm.put(starr[i], hm.get(starr[i])+1);
				}
			else {
				hm.put(starr[i], 1);
			}
		}
		
		Set <String>ks = hm.keySet();
		Iterator<String> iter =  hm.keySet().iterator();
//		while(iter.hasNext()) {
//			System.out.println("------------------------------------------------");
//	          System.out.println("Iterating Map in Java using KeySet Iterator");
//	          String key = (String) iter.next();
//	          System.out.println("key: " + key + " value: " + hm.get(key));
//		}
		int max = 0;
		String k ="";
		for (Entry<String,Integer> es: hm.entrySet()) {
			String K = es.getKey();
			int v = es.getValue();
			System.out.println(K+" "+v);
			if (v > max) {
				max = v;
				k = K;
			}
			
			
		}
		System.out.println("The key "+ k + " is repeated the maximum times :" +max );
	}

}
