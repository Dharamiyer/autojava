package revisePac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Anaginstr {

	public static void main(String[] args) {
		String astr = "sur,art,agt,act,cat,bat,tag,rat,man,tar,tac,tca,tab, gta";
		String[] sarr = astr.split("[ ,,]");
		int len = sarr.length;
		LinkedHashMap <String, Integer> hm = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < len ;i++) {
			for (int j = i+1; j < len; j++) {
				char[] x = sarr[i].toCharArray();
				char[] y = sarr[j].toCharArray();
				Arrays.sort(x);
				Arrays.sort(y);
				if (Arrays.equals(x,y)) {
					hm.put(sarr[i],0);
					hm.put(sarr[j], 0);
				//System.out.println(sarr[i]+ " , " + sarr[j] + " are Anagrams");
				
				}
				
			}

		}
		for(Entry <String, Integer> entry :hm.entrySet()) {
			String s = entry.getKey();
			System.out.print(s +", ");
		}
	}

}
