package org.webskey.codingexercises;

import java.util.HashSet;
import java.util.Set;

public class StringUniqueChars {
	
	public static boolean hasUniqueChars(String s) {
		Set<Character> charSet = new HashSet<>();

		for(int i = 0; i < s.length(); i++)
			charSet.add(s.charAt(i));

		return s.length() == charSet.size();
	}

	public static void main(String[] args) {
		System.out.println(hasUniqueChars("abcd"));
		System.out.println(hasUniqueChars("ananas"));
		System.out.println(hasUniqueChars("123abc"));
		System.out.println(hasUniqueChars("1231abc"));
	}
}
