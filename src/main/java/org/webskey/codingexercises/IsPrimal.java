package org.webskey.codingexercises;

public class IsPrimal {

	public static boolean isPrime(int number) {
		if(number == 0 || number == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if(number%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {

		System.out.println(IsPrimal.isPrime(9));

		System.out.println(IsPrimal.isPrime(11));

		System.out.println(IsPrimal.isPrime(25));

		System.out.println(IsPrimal.isPrime(0));

		System.out.println(IsPrimal.isPrime(2));

		System.out.println(IsPrimal.isPrime(17));

		System.out.println(IsPrimal.isPrime(9));

		System.out.println(IsPrimal.isPrime(23));

	}

}
