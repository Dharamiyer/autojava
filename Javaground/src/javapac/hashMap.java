package javapac;
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;



public class hashMap {

	public static void main(String[] args) {
	String repeat = "This is an example string that has many words repeated many times. This program will find most repeated words that have been repeated most number of times";
    HashMap <String,Integer> hm = new HashMap<String, Integer>();
    String delims = "[ .,?!]+";     //-----------------> Regex
    String[] tokens = repeat.split(delims);
  
    int len = tokens.length;
   /* for (int i = 0; i < tokens.length ; i++) {
    	System.out.println(tokens[i]);  	
    }*/
       
       for (int i = 0; i < len ; i++) {
    	   if (hm.containsKey(tokens[i])) {
    		   hm.put(tokens[i],hm.get(tokens[i])+ 1);	      
    	   }
    	   else {
    		   hm.put(tokens[i], 1);
    	   }
    	   
       }
       
       // Using Keyset and Iterator
       Set<String> keySet = hm.keySet();
       Iterator<String> keySetIterator = keySet.iterator();
       while (keySetIterator.hasNext()) {
          System.out.println("------------------------------------------------");
          System.out.println("Iterating Map in Java using KeySet Iterator");
          String key = keySetIterator.next();
          System.out.println("key: " + key + " value: " + hm.get(key));
       }
       
       // Using Entryset .
       for (Entry<String, Integer> entry: hm.entrySet()) {
    	   System.out.println("key: " + entry.getKey() + " value: " + entry.getValue()); 
    	   
       }
    
	}

}
