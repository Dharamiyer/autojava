package revisePac;

import java.util.HashMap;
import java.util.Map.Entry;

public class MostRepWordCount {

	public static void main(String[] args) {
		String str = "is string string most repeated string repeated many times isthe word string";
		String[] sa = str.split(" ");
		int len = sa.length;
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		for (int i = 0; i < len; i++) {
			if (hm.containsKey(sa[i])) {
				hm.put(sa[i],hm.get(sa[i])+1);
			}
				else {
					hm.put(sa[i], 1);
				}
			}
		int max = 0;
		String word = "";
		for (Entry <String,Integer> ent: hm.entrySet()) {
			String key = ent.getKey();
			int val =  ent.getValue();
			if (val >= max) {
				max = val;
				word = key;
				
			}
			System.out.println(key +","+val);
			
		}
		System.out.println(word+" , "+max);
	}
}


