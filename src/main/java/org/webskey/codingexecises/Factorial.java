package org.webskey.codingexecises;

import java.util.Scanner;

public class Factorial {

	static long b = 1;

	public static long factorial(long num) {
		if(num == 0)
			return 1;
		if(num == 1)
			return b;
		b *= num;
		return factorial(num-1);
	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			long num = sc.nextInt();
			System.out.println(Factorial.factorial(num));
		}
	}
}
