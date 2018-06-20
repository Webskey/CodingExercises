package org.webskey.codingexercises;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			int tests = scanner.nextInt();
			for(int i = 0; i < tests; i++) {
				int num = scanner.nextInt();
				if((num % 2) == 0)
					System.out.println(num + " is even");
				else
					System.out.println(num + " is odd");
			}
		}		
	}
}