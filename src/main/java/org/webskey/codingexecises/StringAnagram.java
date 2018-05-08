package org.webskey.codingexecises;

import java.util.Arrays;

public class StringAnagram {
	public static boolean isAnagram(String s1, String s2) {
		char[] a1 = s1.replaceAll(" ", "").toCharArray();
		char[] a2 = s2.replaceAll(" ", "").toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		return Arrays.equals(a1, a2);
	}

	public static void main(String[] args) {
		String s1 = "kebab";
		String s2 = "babke";
		System.out.println(isAnagram(s1, s2));
		System.out.println(isAnagram("one", "two"));
		System.out.println(isAnagram("dwza t rzay r", "raz dwa trzy"));
	}
}
