package javapac;

import java.util.Arrays;

public class numbersInString {
	

	public static void main(String[] args) {
		String numbstr = "string 9 is 27 string";
		numbstr = numbstr.replaceAll("[^0-9]+", " ");
		System.out.println(Arrays.asList(numbstr.trim().split(" ")));
		
		

	}

}

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

 * 
 * 
 * 
 * 
 
*******************************************************************************************/