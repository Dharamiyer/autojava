package revisePac;

import java.util.Arrays;

public class anagram {
	public static boolean isAnagram(String s1, String s2){
	    s1 =  s1.replaceAll("\\s", "");
	    s2 =  s2.replaceAll("\\s", "");
	    char[] c1 = s1.toLowerCase().toCharArray();
	    char[] c2 = s2.toLowerCase().toCharArray();
	    Arrays.sort(c1);
	    Arrays.sort(c2);
	    return Arrays.equals(c1, c2);
	  }

	  public static boolean isAnagramStringComparison(String s1, String s2){
	    s1 =  s1.replaceAll("\\s", "");
	    s2 =  s2.replaceAll("\\s", "");
	    char[] c1 = s1.toCharArray();
	    if(s1.length() != s2.length())
	      return false;
	    else{
	      for(char c : c1){
	        int index = s2.indexOf(c);
	        if(index != -1){
	          s2 = s2.substring(0,index)+s2.substring(index+1,s2.length());
	        }
	        else
	          return false;
	      }
	      return true;
	    }
	  }

	  public static void main(String[] args){
	   System.out.println(anagram.isAnagram("keep", "peek"));
	   System.out.println(anagram.isAnagram("Dormitory", "Dirty room"));

	   System.out.println(anagram.isAnagramStringComparison("keep", "peek"));
	   System.out.println(anagram.isAnagramStringComparison("Dormitory", "Dirty room"));

	   System.out.println(anagram.isAnagramStringComparison("Dormitory", "Dirty roam"));
	}

}
