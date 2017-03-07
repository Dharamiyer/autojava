package revisePac;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class AnaInStr {

	public static void main(String[] args) {
		String[] str = {"cat","tac","rain","nrai","cta","bus","rus"};
		char[] ca;
		int len = str.length;
		LinkedHashMap <String,Integer> hm = new LinkedHashMap<String,Integer>();
		for (int i = 0; i<len;i++) {
			for (int j = i+1; j < len; j++) {
				char[] x = str[i].toCharArray();
				char[] y = str[j].toCharArray();
				Arrays.sort(x);
				Arrays.sort(y);
				if (Arrays.equals(x, y)) {
					hm.put(str[i], 0);
					hm.put(str[j],0);
				}
			}
		}
		System.out.println("Printing Anagrams below :");
		for (Entry<String, Integer>entry : hm.entrySet()) {
			String ana = entry.getKey();
			System.out.print(ana +" , ");
		}
	}

}
