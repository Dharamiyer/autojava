package revisePac;

import java.util.Scanner;

public class hacRnkstr {

	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
       int lenA = A.length();
        int lenB = B.length();
        int l = lenA +lenB;
            System.out.println(l);
      if (A.compareTo(B) > 0){
         System.out.println("Yes") ;
      }
         if(A.compareTo(B) < 0){
            System.out.println("No");
        }
         if(A.compareTo(B) == 0){
            System.out.println("equal"); 
        }
        
        String Aa = A.substring(0,1).toUpperCase()+A.substring(1,lenA);
        System.out.println(Aa);
        
        String Bb = B.substring(0,1).toUpperCase()+B.substring(1,lenB);
        System.out.println(Bb);
        
	}

}
