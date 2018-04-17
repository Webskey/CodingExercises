package org.webskey.codingexecises;

public class Palindrome {
	
	public static boolean isPalindrome(String str) {
		int l = str.length()-1;
		String revStr = "";
		for(int i = l; i >=0; i--) {			
			revStr += str.charAt(i);
		}
		return str.equals(revStr);
	}
	public static void main(String[] args) {
		
		System.out.println(Palindrome.isPalindrome("kajak"));
		System.out.println(Palindrome.isPalindrome("miecz"));
		System.out.println(Palindrome.isPalindrome("oko"));
		System.out.println(Palindrome.isPalindrome("123k321"));
	}
}
