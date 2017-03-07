package revisePac;

public class StringDeMystified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ab 123f 9g";
		// Substrings
		String subs = str.substring(0,3);
		System.out.println(subs);
		
		// replaceall with Regex 
		String rex = "([0-9])";
		String repl = str.replaceAll(rex, "");
		System.out.println(repl);
		String temp = "";
		
		//Group and add numbers
		int total = 0;
		int len = str.length();
		for (int i = 0 ; i < len; i++) {
		if (Character.isDigit(str.charAt(i))) { // use Character.isDigit() to verify if it is a digit..
			temp += str.charAt(i);
			
		}
		if (Character.isLetter(str.charAt(i))) {// use Character.isLetter() to verify if it is a digit..
			if (!temp.isEmpty()) {
			total += Integer.parseInt(temp); // Use Integer.parseInt(String s) - to get the integer value of a number string.
			System.out.println(total);
			temp = "";}
		}
		}
		System.out.println(total);

	}

}
