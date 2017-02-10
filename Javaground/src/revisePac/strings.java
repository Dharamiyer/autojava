package revisePac;

import java.util.Arrays;
import java.util.Scanner;

public class strings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int len = str.length();
		// Substring
		String subs = str.substring(0).toUpperCase()+str.substring(1, len);
		String sub = str.substring(0,1).toUpperCase();
		//String s = sub.toUpperCase();
		String x = sub +str.substring(1, len);
		System.out.println(x);
		// Compareto
		System.out.println(str.compareTo("Appu"));
		System.out.println(str.compareToIgnoreCase("Appu")); 
		// String to Char[] aadn anagram
		String str2 = "ppau";
		char[] cstr = str.toCharArray();
		char[] istr = str2.toCharArray();
		Arrays.sort(cstr);
		Arrays.sort(istr);
		if (Arrays.equals(cstr, istr)) {
			System.out.println("Anagrams");	
		}
		else {
			System.out.println("Not Anagrams"); // will fail when case sensitive comparison is made
		}
		// convert Char[] to String
		char[] carr = {'a','b','c'};
		String s = String.valueOf(carr);
		System.out.println(s);
	}

}
