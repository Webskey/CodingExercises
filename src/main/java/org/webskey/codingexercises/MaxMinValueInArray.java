package org.webskey.codingexercises;

public class MaxMinValueInArray {
	public static int max(int[] tab) {
		int max = tab[0];
		for(int i = 1; i < tab.length; i++)
			if(tab[i] > max)
				max = tab[i];
		return max;
	}

	public static int min(int[] tab) {
		int min = tab[0];
		for(int i = 1; i < tab.length; i++)
			if(tab[i] < min)
				min = tab[i];
		return min;
	}
	public static void main(String[] args) {
		int[] tab = { 11, 13, 5, 65, 64, 45, 23};
		System.out.println(max(tab));
		System.out.println(min(tab));		
	}
}
