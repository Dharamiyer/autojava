package javapac;
import java.io.*;

public class fibonacci {

	public static void main(String[] args) {
		int a = 0; 
		int b = 0;
		int c = 1;
		for (int i = 0 ; i < 5 ; i++ ) {
			a = b;
			b = c ;
			c = a + b;
			System.out.println(c);
			
		}
	}

}
