package org.webskey.codingexercises.interviewcake;

//	https://www.interviewcake.com/question/java/find-rotation-point
public class FindRotationPoint {

	public static void findRotationPoint(String[] array, int start, int end) {	
		int last = (start + end + 1) / 2;				
		if(end == last) {
			System.out.println("Rotation point is at index no. " + (last) + " - " + array[last]);
			return;
		}		
		if(array[start].compareTo(array[last]) > 0) 	
			findRotationPoint(array, start, last);
		else 
			findRotationPoint(array, last, end);
	}

	public static void main(String[] args) {
		String[] words = new String[]{	
				"ptolemaic",
				"retrograde",
				"supplant",
				"undulate",
				"xenoepist",
				"asymptote",  
				"babka",
				"banoffee",
				"engender",
				"karpatka",
				"othellolagkage",	
		};
		findRotationPoint(words, 0, words.length-1);
	}
}