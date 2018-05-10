package org.webskey.codingexecises;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharCount {

	public static void main(String[] args) {
		String word = "thneh honnnest  tom";
		StringBuilder sb = new StringBuilder(word);
		Map<Character, Integer> charMap = new HashMap<>();
		for(int i = 0; i < sb.length(); i++) {			
			if(!charMap.containsKey(sb.charAt(i)))
				charMap.put(sb.charAt(i), 1);
			else {
				int count = charMap.get(sb.charAt(i));
				count ++;
				charMap.replace(sb.charAt(i), count);
			}
		}
		Set<Entry<Character, Integer>> set = charMap.entrySet();
		System.out.println(set);
	}
}