package org.webskey.codingexecises;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {

		int[] tab = {1, 2, 3, 4, 5};
		int tabLength = tab.length;
		int[] tabR = new int[tabLength];
		for(int i = 0; i < tab.length; i++) {
			tabLength--;
			tabR[i]=tab[tabLength];			
		}

		System.out.println(Arrays.toString(tabR));
	}
}
