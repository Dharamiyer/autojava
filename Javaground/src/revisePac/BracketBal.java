package revisePac;

import java.util.Stack;

public class BracketBal {
	public static Boolean isBalanced(String x) {
		Boolean bool = true;
		Stack <Character> s = new Stack<Character>();
		int len = x.length();
		for (int i = 0; i < len; i++) {
			char c = x.charAt(i);
			if (c == '{' || c == '[' || c == '(' ) {
				s.push(c);
			}
		    if(c == '}' || c == ']' || c == ')' ) {
			char top =	s.peek();
			if (top == '{' && c == '}' || top == '[' && c == ']' || top == '(' && c == ')' ) {
				s.pop();
			}
			else{
				bool = false;
			}
				
			}
			
			
		}
		return bool;
	}

	public static void main(String[] args) {
		String bracket = "{[(}]}";
		Boolean balancd = BracketBal.isBalanced(bracket);
		System.out.println(balancd);
		
	}

}
