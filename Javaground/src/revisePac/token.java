package revisePac;

public class token {

	public static void main(String[] args) {
		
		String inp = "He is a very very good boy, isn't he?";
		String inpu = inp.replaceAll("[,;'?]", "");
		String[] sa = inpu.split(" ");
		int len = sa.length;
		System.out.println(len);
		for(int i = 0; i < len; i++) {
			System.out.println(sa[i]);
		}
		

	}

}
