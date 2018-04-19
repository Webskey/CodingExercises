package org.webskey.codingexecises;

public class DecToBi {
	public static void decToBin(int n) {
		if (n > 0) {
			decToBin(n / 2);
			System.out.print(n % 2);
		}
	}
	public static void main(String[] args) {
		DecToBi.decToBin(45);
		System.out.println();
		DecToBi.decToBin(37);
		System.out.println();
		DecToBi.decToBin(25);
		System.out.println();
		DecToBi.decToBin(22);
		System.out.println();
		DecToBi.decToBin(16);
		System.out.println();
		DecToBi.decToBin(5);
	}
}
