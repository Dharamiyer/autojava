package revisePac;

import java.util.Arrays;

public class Anugram {
public static Boolean isAna(String a, String B) {
	
	char[] first = a.toCharArray();
	char[] second = B.toCharArray();
	Arrays.sort(first);
	Arrays.sort(second);
	return Arrays.equals(first, second);
	
	
	
}
	public static void main(String[] args) {
	Boolean x = Anugram.isAna("garam", "marag");
	System.out.println(x);

	}

}
