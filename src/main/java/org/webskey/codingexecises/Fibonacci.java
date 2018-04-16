package org.webskey.codingexecises;

public class Fibonacci {
	
	
	public static int getFib(int num) {
		if(num == 0)
			return 0;
		if(num == 1 || num == 2)
			return 1;
		else {
			return getFib(num-1) + getFib(num-2);
		}
	}

	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++)
		System.out.println(Fibonacci.getFib(i));		
	}
}
