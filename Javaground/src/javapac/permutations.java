package javapac;

import java.util.Scanner;

public class permutations {
	 public static void ComputePermutations(String input){
	      ComputePermutations("",input);
	    }
	    public static void ComputePermutations(String prefix, String input){
	        if(input.length() == 0){
	          System.out.println(prefix);
	        }
	        else{
	        for(int i = 0; i < input.length();i++){
	            ComputePermutations(prefix + input.charAt(i),input.substring(0,i) + input.substring(i+1));
	        }
	        }
	    }



	  public static void main(String[] args){
	    System.out.println("Enter String");
	    Scanner keyboard = new Scanner(System.in);
	    String input = keyboard.next();
	    keyboard.close();
	    ComputePermutations(input);


	  }
	}