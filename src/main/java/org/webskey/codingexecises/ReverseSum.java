package org.webskey.codingexecises;

import java.util.Scanner;

class ReverseSum {
	int b;

	public int reverse(int a) {
		b += a%10;

		if(a >= 10) {
			b *= 10;
			return reverse((a/10));
		}
		else {
			if(b == 0) {
				return a;
			}
			return b;
		}
	}
	public static void main (String[] args)	{
		ReverseSum rev = new ReverseSum();

		try (Scanner sc = new Scanner(System.in)) {
			int tests = sc.nextInt();
			
			for(int i = tests; i > 0; i--) {
				int one = sc.nextInt();
				int two = sc.nextInt();
				one = rev.reverse(one);
				rev.b=0;
				two = rev.reverse(two);
				rev.b=0;
				int sum = rev.reverse(one+two);
				rev.b=0;
				System.out.println(sum);
			}
		}
	}
}