package revisePac;

public class ReverStringInPlace {

	public static void main(String[] args) {
		String x = "This is a string";
		int l = x.length();
		for (int i = 0; i < l;i++) {
			for (int j = l-1;j>=0;j--) {
				x.replace(x.charAt(i),x.charAt(j));
			}
		}
//		String rev ="";
//		char c ;
//		int len = x.length();
//		int l = len -1;
//		for (int i = 0; i < len; i++) {
//			rev += x.charAt(l);
//			l--;
//		}
//		String[] sa = x.split(" ");
//		int slen = sa.length;
//		String revword = "";
//		for (int i = slen-1 ; i >= 0; i--) {
//			revword += sa[i]+" ";
//		}
		
//		System.out.println(revword);
		System.out.println(x);
		
	}

}
