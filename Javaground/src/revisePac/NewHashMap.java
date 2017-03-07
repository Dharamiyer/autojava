package revisePac;

import java.util.HashMap;
import java.util.Map.Entry;

public class NewHashMap {

	public static void main(String[] args) {
		String str = "This repeated is repeated thrice repeated string";
		String rex = " ";
		String[] sa = str.split(rex);
		int len = sa.length;
		HashMap <String,Integer> hm = new HashMap<String,Integer>();
		// check if key already in hm and based on that , increment value
		
		for (int i = 0; i < len; i++) {
			if(hm.containsKey(sa[i])) {
				hm.put(sa[i], hm.get(sa[i]) +1);
				
			}
			else {
				hm.put(sa[i], 1);
			}
		}
		String maxkey = "";
  	  int maxval = 1;
      for (Entry <String,Integer> entry : hm.entrySet()){
    	  String k = entry.getKey();
    	  int v = entry.getValue();    	  
    	  System.out.println(k + " "+v);
    	  if(v > maxval) {
    		  maxkey = k;
    		  maxval = v;
    		  
    	  }
          }
      System.out.println(maxkey +","+maxval);
	}

}
