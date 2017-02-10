package revisePac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arraylistex {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the number of elements.. :");
		    int n = scan.nextInt();
		    ArrayList<Integer> list = new ArrayList<Integer>();
		    for(int i = 0; i<n; i++)
		        {
		    	 System.out.println("Enter the next element. :");
		        Integer k = scan.nextInt(); // input integer
		        list.add(k);
		    }
		    System.out.println("Enter the number of queries:");
		    int q = scan.nextInt();
		    for(int i = 0; i<q; i++)
		        {
		    	System.out.println("insert or delete :");
		        String type = scan.next(); 
		        if(type.equals("Insert"))
		            {
		        	System.out.println("Enter values ints :");
		            int x = scan.nextInt();
		            int y = scan.nextInt();
		            list.add(x,y);

		        }
		        else if(type.equals("Delete"))
		            {
		            int z = scan.nextInt();
		            list.remove(z);

		        }
		    }
		    for(Integer name : list)
		        {
		        System.out.print(name + " ");
		    }
		

	}

}
