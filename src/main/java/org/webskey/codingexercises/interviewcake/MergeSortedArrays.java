package org.webskey.codingexercises.interviewcake;

import java.util.Arrays;

//	https://www.interviewcake.com/question/java/merge-sorted-arrays
public class MergeSortedArrays {

	public static int[] mergeArrays(int[] arrayOne, int[] arrayTwo) {
		int j = arrayOne.length;
		int k = arrayTwo.length;
		int[] newArray = new int[j + k];

		int x = 0, y = 0, z = 0;
		while(j > x && k > z) {
			if(arrayOne[x] < arrayTwo[z]) {
				newArray[y] = arrayOne[x];
				x++;
				y++;
			}else {
				newArray[y] = arrayTwo[z];
				y++;
				z++;
			}
		}
		System.out.println("x " + x + " z " + z);
		if(!(j == x)) {
			for(int i = x; i < j; i++) {
				newArray[y] = arrayOne[i];
				y++;
			}
		}
		if(!(k == z)) {
			for(int i = z; i < k; i++) {
				newArray[y] = arrayTwo[i];
				y++;
			}
		}
		return newArray;
	}

	public static void main(String[] args) {
		int[] myArray = new int[]{3, 4, 6, 10, 11, 15};
		int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19};

		System.out.println(Arrays.toString(mergeArrays(myArray, alicesArray)));
		// prints [1, 3, 4, 5, 6, 8, 10, 11, 12, 14, 15, 19]
	}
}
