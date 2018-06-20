package org.webskey.codingexercises;

import java.util.Scanner;

public class PrintWhileNot42 {
	public static void main( String[] args ) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int num; 
			while((num = sc.nextInt()) !=42){
				System.out.println(num);
			}
		}
	}
}
