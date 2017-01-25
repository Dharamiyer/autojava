package javapac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class stackLifo {

	String[] a;
	  int top;

	  public stackLifo(int size){
	    a = new String[size];
	    top = -1;
	  }

	  public boolean isEmpty(){
	    return (top<0);
	  }

	  public int getStackSize(){
	    return a.length;
	  }

	  public void push(String s){
	    if(top < a.length-1 )
	      a[++top] =s;
	  }

	  public int numberOFItemsInStack(){
	    return top+1;
	  }

	  public String pop(){
	    if(top>=0)
	      return a[top--];
	    return "Stack is Empty";
	  }


	public static void main(String[] args){
	  stackLifo stack = new stackLifo(5);
	  stack.push("day");
	  stack.push("great");
	  stack.push("a");
	  stack.push("Have");
	  System.out.println(stack.pop() +" "+ stack.pop() +" "+ stack.pop()+" "+stack.pop());

	}

}


