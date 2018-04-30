package org.webskey.codingexecises;

public class PowerRecursive {
	
	public static int pow(int num, int pow) {
		if(pow == 0) return 1;
		if(pow == 1) return num;
		else return num * pow(num, pow-1);
	}

	public static void main(String[] args) {
		System.out.println(pow(2, 0));
		System.out.println(pow(2, 1));
		System.out.println(pow(2, 2));
		System.out.println(pow(2, 3));
		System.out.println(pow(2, 4));
		
		System.out.println(pow(48, 0));
		System.out.println(pow(633, 1));
		System.out.println(pow(5, 2));
		System.out.println(pow(10, 3));
		System.out.println(pow(3, 4));

	}

}
