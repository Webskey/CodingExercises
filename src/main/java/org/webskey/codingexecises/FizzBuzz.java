package org.webskey.codingexecises;

import java.util.Scanner;

public class FizzBuzz {
	public static void main( String[] args ) {
		
		try (Scanner sc = new Scanner(System.in)) {			
			int tests = sc.nextInt();
			
			for(int i = 0; i <= tests; i++) {
				if((i % 3) == 0 && (i % 5) == 0)
					System.out.println("fizz buzz");
				else if((i % 3) == 0)
					System.out.println("fizz");
				else if((i % 5) == 0)
					System.out.println("buzz");				
				else
					System.out.println(i);
			}
		}
	}
}
