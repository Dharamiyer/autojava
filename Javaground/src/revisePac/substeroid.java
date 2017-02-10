package revisePac;

import java.util.Scanner;

public class substeroid {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		String str = scan.next();

		int len = str.length();
		String s1 = "";
		for (int i = 0; i < len - 2; i++) {
			int j = i + 3;
			s1 += str.substring(i, j);
			s1 += ",";

		}
		System.out.println(s1);
		String s2 = s1.replaceAll(",", "");
		System.out.println(s2);
		int s2len = s2.length();
		String great = "";
		String small = "";
		for (int i = 0; i < (s2len - 2); i += 3) {
			int j = 3;
			great = s2.substring(0, 3);
			small = s2.substring(j + 1, j + 4);
			System.out.println(great);
			System.out.println(small);
			if (great.compareTo(small) == 0) {
//				great = "";
//				small = "";
				
				j += 3;

			}
			if (great.compareTo(small) < 0) {

				String temp = great;
				great = small;
				small = great;
				
				j += 3;
			}
			if (great.compareTo(small) > 0) {

				j += 3;
			}
			

		}
		System.out.println(great);
		System.out.println(small);
	}
}
