package revisePac;

public class NosinString {

	public static void main(String[] args) {
		String nos = "a 9 th 27 and 36 is added to 45";
		int len = nos.length();
		int total = 0;
		String temp = "";
		for (int i = 0; i < len; i++) {
			char c = nos.charAt(i);
			if (Character.isDigit(c)) {
				temp += c;
       			}
			if(i == len-1 && !temp.isEmpty()) {
				total += Integer.parseInt(temp);
			}
			if (Character.isLetter(c)) {
				if (!temp.isEmpty()) {
				total += Integer.parseInt(temp);
				temp = "";
				}
			}
		}
		
  System.out.println(total);
	}

}
