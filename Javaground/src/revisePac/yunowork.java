package revisePac;

import java.util.Scanner;

public class yunowork {

	public static void main(String[] args) {
		 
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
       int len = (A.length() + B.length());
        System.out.println(len);
       int x = A.compareTo(B);
        if (x < 0){
            System.out.println("No");
        }else if(x > 0){
          System.out.println("yes");  
        }else{
            System.out.println("equal");  
        }
        String x1 = A.substring(0,1).toUpperCase();
        String y1 = B.substring(0,1).toUpperCase();
        int lena = A.length();
        int lenb = B.length();
        System.out.println(x1+A.substring(1,lena));
         System.out.println(y1+B.substring(1,lenb));
        
        
	}

}
