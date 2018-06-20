package org.webskey.codingexercises;

public class MatchingParentheses {
	public static boolean isMatching(String string) {
		int leftP = 0;
		int rightP = 0;

		for(int i = 0; i < string.length(); i++) {
			if(string.charAt(i) == '(')
				leftP++;
			else if(string.charAt(i) == ')')
				rightP++;
		}
		return leftP == rightP;
	}
	public static void main(String[] args) {		
		System.out.println(isMatching("()()()(()"));
		System.out.println(isMatching("((()))"));
		System.out.println(isMatching("((())))"));
		System.out.println(isMatching("((()())))((()()())"));
	}
}
