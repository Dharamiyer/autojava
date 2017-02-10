package revisePac;

import java.util.HashMap;

public class mostRepeated {

	public static void main(String[] args) {
	String str = "this string has many reoeated words repeated many times. repeated times find repeated times.";
	String reg = "[.!,\\s]+";
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

	}

}
