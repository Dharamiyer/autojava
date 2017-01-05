package javapac;

public class palindrome {

	public static void main(String[] args) {
		String input = "madam";
		int len = input.length();
		int fwindex = 0;
		int bwindex = len-1;
		boolean bool = true;
		for (int i =0; i < len-1; i++) {
			char x = input.charAt(fwindex);
			char y = input.charAt(bwindex);
			if(x != y){
				bool = false;
				System.out.println("Nope..");
				break;
			}
			fwindex++;
			bwindex--;
		}
     if(bool) {System.out.println("palindrome");}

		
	}

}
