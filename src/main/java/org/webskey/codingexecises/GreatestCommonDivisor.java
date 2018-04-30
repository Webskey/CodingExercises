package org.webskey.codingexecises;

public class GreatestCommonDivisor {
	
	public static int gcd(int one, int two) {
		if(one % two == 0) return two;
		return gcd(two, one%two);
	}

	public static void main(String[] args) {
		System.out.println(gcd(500, 235));
		System.out.println(gcd(111, 39));
		System.out.println(gcd(2634, 1387));
	}

}
