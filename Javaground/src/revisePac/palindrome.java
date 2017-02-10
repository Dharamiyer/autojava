package revisePac;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String input = scan.next();
		scan.close();
		int len= input.length();
//		int fwindex = 0;
//		int bindex = len-1;
//		Boolean bool = true ;
//		for (int i = 0, j = (len-1) ; i < len; i++,j--) {
//			
//			char x = input.charAt(i);
//			char y = input.charAt(j);
//			if (x != y) {
//				bool = false;
//				break;
//			
//			}
//		}
//		if(bool) {System.out.println("Palin");}
//		else{System.out.println("Nope");}
		
		// Attempting another way of doing this
		String s2 = "";
		int j = len - 1;
		for (int i = 0; i < len; i++) {
			s2 += input.charAt(j);
			j--;
		}
		System.out.println(s2);
		if (s2.equals(input)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		
		
		}
}
			
		
		



