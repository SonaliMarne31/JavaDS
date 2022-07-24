package Strings;
import java.util.*;

public class ValidParenthesis {
    public boolean checkValidParenthesis(String str) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put(')', '(');
		map.put('}', '{');
		map.put(']', '[');
		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < str.length() ; i++) {
			char c = str.charAt(i);
			
			if(map.containsKey(c)) { // closing parenthesis
				char compareWith = stack.pop();
				if (null != map.get(c) && compareWith == map.get(c)) {
					continue;
				} else {
					return false;
				}
			} else {
				// add opening parenthesis
				stack.push(c);
			}
			
		}
		if(stack.isEmpty()) return true;
		return false;
	}
	
	public static void main(String args[]) {
		ValidParenthesis v = new ValidParenthesis();
		boolean isValid = v.checkValidParenthesis("{[]}");
		System.out.print(isValid);
	}
}
