package org.webskey.codingexecises;

public class DecToOctal {
	public static int decToOctal(int num) {
		if(num / 8 == 0)
			return num;
		return num % 8 + 10 * decToOctal(num / 8);
	}
	public static void main(String[] args) {
		System.out.println(decToOctal(15));
		System.out.println(decToOctal(150));
		System.out.println(decToOctal(58));
		System.out.println(decToOctal(8));
		System.out.println(decToOctal(89));
		
	}

}
