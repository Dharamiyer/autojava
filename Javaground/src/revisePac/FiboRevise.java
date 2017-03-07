package revisePac;

public class FiboRevise {

	public static void main(String[] args) {
		int start = 0;
		int next = 0;
		int fibo = 1;
		for (int i =0; i < 7; i++) {
			start = next;
			next = fibo;
			fibo = start+next;
			System.out.println(fibo);
			
		}

	}

}
