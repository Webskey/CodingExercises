package org.webskey.codingexecises;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharCount {
	
	public static Map<Character, Integer> countChars(String s) {
		
		Map<Character, Integer> charMap = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++) {			
			if(!charMap.containsKey(s.charAt(i)))
				charMap.put(s.charAt(i), 1);
			else {
				int count = charMap.get(s.charAt(i));
				count ++;
				charMap.replace(s.charAt(i), count);
			}
		}
		
		return charMap;
	}
	public static void main(String[] args) {
		String word = "thneh honnnest  tom";
		String word1 = "aabccdeefgghiijkk";
		
		Set<Entry<Character, Integer>> set = countChars(word).entrySet();
		System.out.println(set);
		
		set = countChars(word1).entrySet();
		System.out.println(set);
	}
}