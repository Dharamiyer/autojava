package javapac;
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;



public class hashMap {

	public static void main(String[] args) {
	String repeat = "This is an example string that has many words repeated many times. This program will find most repeated words that have been repeated most number of times";
    HashMap <String,Integer> hm = new HashMap<String, Integer>();
    String delims = "[ .,?!]+";
    String[] tokens = repeat.split(delims);
    int len = tokens.length;
   /* for (int i = 0; i < tokens.length ; i++) {
    	System.out.println(tokens[i]);  	
    }*/
       Iterator iter = hm.keySet().iterator();
       
       for (int i = 0; i < len ; i++) {
    	   if (hm.containsKey(tokens[i])) {
    		   hm.put(tokens[i],hm.get(tokens[i])+ 1);	      
    	   }
    	   else {
    		   hm.put(tokens[i], 1);
    	   }
    	   
       }
       
       Set<String> keySet = hm.keySet();
       Iterator<String> keySetIterator = keySet.iterator();
       while (keySetIterator.hasNext()) {
          System.out.println("------------------------------------------------");
          System.out.println("Iterating Map in Java using KeySet Iterator");
          String key = keySetIterator.next();
          System.out.println("key: " + key + " value: " + hm.get(key));
       }


  //     Read more: http://javarevisited.blogspot.com/2011/12/how-to-traverse-or-loop-hashmap-in-java.html#ixzz4VITY4Vv0
       
       while (iter.hasNext()) {
    	   String key =  (String) iter.next();
			int val = hm.get(key);
			System.out.println("Key :" +key + " Value  :" +val);
       }
    
	}

}
