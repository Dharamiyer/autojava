package revisePac;

import java.util.ArrayList;
import java.util.Scanner;

public class aListNoWok {

	public static void main(String[] args) {
		ArrayList <Integer> al = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of inputs:");
        int num = scan.nextInt();
        for (int i = 0 ; i < num ; i++){
         System.out.println("Enter  inputs:");
            int x = scan.nextInt();
            al.add(x);
            }
        System.out.println("Insert or delete");
        String choice = scan.next();
        if (choice.equalsIgnoreCase("insert")){
            System.out.println("Enter location ");
            int loc = scan.nextInt();
             System.out.println("Enter value ");
            int val = scan.nextInt();
            al.add(loc,val);
          }
        else if(choice.equalsIgnoreCase("delete")){
           System.out.println("Enter value ");
            int val = scan.nextInt(); 
            al.remove(val);
        }
        for (Integer liv : al){
           System.out.println(liv); 
           
        }
	}

}
