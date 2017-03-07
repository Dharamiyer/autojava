package revisePac;

import java.util.Arrays;

public class regex {
	/**********************************************************************************
	 * 3.1. Common matching symbols

	Matches any character
	^regex
	Finds regex that must match at the beginning of the line.
	regex$
	Finds regex that must match at the end of the line.
	[abc]
	Set definition, can match the letter a or b or c.
	[abc][vz]
	Set definition, can match a or b or c followed by either v or z.
	[^abc]
	When a caret appears as the first character inside square brackets, it negates the pattern. This pattern matches any character except a or b or c.
	[a-d1-7]
	Ranges: matches a letter between a and d and figures from 1 to 7, but not d1.
	X|Z
	Finds X or Z.
	XZ
	Finds X directly followed by Z.
	$
	Checks if a line end follows.
*******************************************************************************************/

	public static void main(String[] args) {
		String str = "This is a number 9 String, ? ! that has 27 Numbers";
		String regx = "[0-9,!,\\s,?]";
		String rex = str.replaceAll(regx,""); // Uses regex above to return string modded with regex.
		System.out.println(rex);
		String[] x = str.split("number"); // returns string array without "number"
		String y = Arrays.toString(x); // Converts String array to string
		System.out.println(y);
		
		String s = "string 9 string 8";
		String rx = "[0-9]";
		String[] sa = s.split(rx);
		s = Arrays.toString(sa);
		System.out.println(s);
		
		
	}

}
