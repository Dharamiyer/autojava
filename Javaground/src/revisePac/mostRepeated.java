package revisePac;

import java.util.HashMap;
import java.util.Map.Entry;

public class mostRepeated {

	public static void main(String[] args) {
	String str = "repeated string repeated words in string max repeated words that are repeatred";
	String reg = "[ ,.?!+]" ;// "[.!,\\s]+"
	String[] sarray = str.split(reg);
	System.out.println(sarray.length);
	int len = sarray.length;
	HashMap <String, Integer> hm = new HashMap<String, Integer>();
	for (int i = 0 ; i < len ; i++) {
		if (hm.containsKey(sarray[i])) {
			hm.put(sarray[i],hm.get(sarray[i] + 1));
			
		}
		else {
			hm.put(sarray[i], 1);
		}
	}
	int max = 0;
	for (Entry <String,Integer> ent: hm.entrySet()) {
		String key = ent.getKey();
		int val =  ent.getValue();
		System.out.println(key +","+val);
		
	}

	}

}
