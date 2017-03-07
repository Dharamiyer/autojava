package revisePac;

import java.util.Stack;

public class BalBrak {

	public static void main(String[] args) {
	
	String brackets = "{[()]}";
	Boolean boo = isBalance(brackets);
	System.out.println(boo);
	}
	

public static Boolean isBalance(String brackets) {
	Boolean b = false;
	if(brackets.isEmpty())
		return true;
	Stack<Character> stack = new Stack<Character>();
	for (int i = 0; i <brackets.length(); i++) {
		char element = brackets.charAt(i);
		if(element == '{' ||element == '[' || element == '(' ) {
		stack.push(element)	;
		}
		if(element == '}' ||element == ']' || element == ')' ) {
			if (stack.isEmpty())
                return false;
			char last = stack.peek();
			if(last == '{' && element == '}' || last == '[' && element == ']' || last == '(' && element == ')') {
				
				stack.pop();
				b = true;
				
				
			}
			else {
				return false;
			}
			
			
		}
		
	}
	
	
	return b;
	
}
}
