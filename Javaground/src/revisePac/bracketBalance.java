package revisePac;

import java.util.Stack;

public class bracketBalance {

	public static void main(String[] args) {
		String brac ="{[()]})";
		Boolean balanced = false;
		int a = 0;
		balanced = bracketBalance.CheckParentesis(brac);
		System.out.println(balanced);

	}
	public static boolean CheckParentesis(String str)
	{
	    if (str.isEmpty())
	        return true;

	    Stack<Character> stack = new Stack<Character>();
	    for (int i = 0; i < str.length(); i++)
	    {
	        char current = str.charAt(i);
	        if (current == '{' || current == '(' || current == '[')
	        {
	            stack.push(current);
	        }


	        if (current == '}' || current == ')' || current == ']')
	        {
	            if (stack.isEmpty())
	                return false;

	            char last = stack.peek();
	            if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
	                stack.pop();
	            else 
	                return false;
	        }

	    }

	    return stack.isEmpty();
	}

}
