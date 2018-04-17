package org.webskey.codingexecises;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	static BigInteger b = new BigInteger("1");

	public static BigInteger factorial(BigInteger num) {
		if(num.equals(BigInteger.valueOf(0)) || num.equals(BigInteger.valueOf(1)))
			return b;
		b = b.multiply(num);
		return factorial(num.subtract(BigInteger.valueOf(1)));
	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int tests = sc.nextInt();

			for(int i = tests; i > 0; i--) {
				int lowerBound = sc.nextInt();				
				System.out.println(Factorial.factorial(BigInteger.valueOf(lowerBound)));
				b = BigInteger.valueOf(1);				
			}
		}
	}
}