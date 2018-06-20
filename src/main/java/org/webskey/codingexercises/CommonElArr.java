package org.webskey.codingexercises;

public class CommonElArr {

	public static void common(int[] arr1, int[] arr2) {
		for(int i = 0; i < arr1.length - 1; i++ ) 
			for(int j = 0; j < arr2.length - 1; j++) 
				if( arr1[i] == arr2[j]) 
					System.out.println(arr1[i]);
	}

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] arr2 = {0, 2, 4, 6, 8, 10};
		common(arr1, arr2);
	}
}
