package revisePac;

public class AddNosInStr {

	public static void main(String[] args) {
		String str = "this is 9 stri81 conta0ng99";
		int len = str.length();
		int total = 0;
		String temp = "";
		for (int i = 0; i < len; i++) {
			if (Character.isDigit(str.charAt(i))) {
				temp += str.charAt(i);
				if (i == len-1) {
					if (!temp.isEmpty()) {
						total += Integer.parseInt(temp);
						temp = "";
						}
					
				}
				
				}
				
			
			if (Character.isLetter(str.charAt(i))) {
				if (!temp.isEmpty()) {
				total += Integer.parseInt(temp);
				temp = "";
				}
				
			}
		}
		System.out.println(total);
	}
}
		
		

	


