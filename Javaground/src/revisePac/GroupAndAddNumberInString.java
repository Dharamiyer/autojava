package revisePac;

public class GroupAndAddNumberInString {

	public static void main(String[] args) {
		String x = "a1b2c,!350d7e";
		int total = 0;
		String intemp = ""; 
		int len = x.length();

		for( int i = 0 ; i <len; i++) {
			if(Character.isDigit(x.charAt(i))) {
				intemp += x.charAt(i);
			}
			if(Character.isLetter(x.charAt(i))) {
			
				if(intemp.length() > 0) {
				
					total += Integer.parseInt(intemp);
					intemp = "";
				}
			}
         }
		
	//	System.out.println(intemp);
		System.out.println(total);

	}

}
