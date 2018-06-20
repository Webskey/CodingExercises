package org.webskey.codingexercises.interviewcake;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//	https://www.interviewcake.com/question/java/find-unique-int-among-duplicates
public class TheStolenBreakfastDrone {	

	public static void main(String[] args) {
		int[] arr =  {1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1};
		Map<Integer, Integer> map = new HashMap<>();

		for(int i = 0 ; i < arr.length; i++)
			if(map.containsKey(arr[i])) 
				map.put(arr[i], 2);
			else
				map.put(arr[i], 1);

		for(Entry<Integer, Integer> entry: map.entrySet())
			if(entry.getValue() == 1)
				System.out.println(entry.getKey());
	}
}