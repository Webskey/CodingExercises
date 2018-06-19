package org.webskey.codingexecises;

import java.util.Arrays;

//	https://www.interviewcake.com/question/java/product-of-other-numbers
public class ProductOfOtherNums {
	
	public static int[] getProductsOfAllIntsExceptAtIndex(int[] array) {
		int[] products = new int[array.length];		
		for(int i = 0; i < array.length; i++) {
			int sum = 1;
			for(int j = 0; j < array.length; j++) {
				if(i == j)
					continue;
				sum = sum * array[j];
			}				
			products[i] = sum;
		}
		return products;
	}
	
	public static void main(String[] args) {
		int[] array = {2, 1, 5, 3};
		System.out.println(Arrays.toString(getProductsOfAllIntsExceptAtIndex(array)));
	}
}