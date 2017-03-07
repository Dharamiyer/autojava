package revisePac;

import java.util.Scanner;

public class isValidName {

	public static void main(String[] args) {
		/*
		 * alpha_naheed
           xahidbuffon
           nagib@007
            123Swakkhar
		 * 
		 */
		String name = "alpha@naheed";
		int i = 0;
		char first = name.charAt(i);
		if(Character.isDigit(name.charAt(i)) || name.contains("@")){
			System.out.println("invalid name");
			
		}else {
			System.out.println("Valid name");
		}
		

	}

}
