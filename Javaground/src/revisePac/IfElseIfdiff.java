package revisePac;

public class IfElseIfdiff {

	public static void main(String[] args) {
		int a = 1; int b = 2; int c = 3;
		// if condition true then all will be executed
		if(a == 1) {
		    System.out.println("First if executed");
		}

		if(b == 2) {
		    System.out.println("Second if executed");
		}

		if(c == 3) {
		    System.out.println("Third if executed");
		}


		// only one will be executed 

		if(a == 1) {
		   System.out.println("First if else executed");
		}

		else if(b == 2) {
		   System.out.println("Second if else executed");
		}

		else if(c == 3) {
		  System.out.println("Third if else executed");
		}

	}

}
