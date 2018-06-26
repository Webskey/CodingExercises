package org.webskey.codingexercises.interviewcake;

import java.util.HashMap;

//	https://www.interviewcake.com/question/java/word-cloud
public class WordCloudData {

	public static void main(String[] args) {
		String sentence = "After beating the eggs, Dana read the next step:" +
				"Add milk and eggs, then add flour and sugar.";
		String[] array = sentence.split("\\W");
		HashMap<String, Integer> map = new HashMap<>();

		for(String word : array) 
			if(map.containsKey(word)) 
				map.put(word.toLowerCase(), map.get(word) + 1);
			else if(!word.equals("")) 
				map.put(word.toLowerCase(), 1);

		System.out.println(map);
	}
}
