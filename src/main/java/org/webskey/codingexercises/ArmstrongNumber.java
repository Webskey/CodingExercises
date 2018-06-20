package org.webskey.codingexercises;

public class ArmstrongNumber {
	
	public static int length(int num) {
		int lngth = 1;
		while(num / 10 != 0) {
			lngth++;
			num = num/10;
		}
		return lngth;
	}
	
	public static boolean isArmstrong(int number) {
		int remainder, sum = 0;
		
		for (int i = number; i > 0; i = i / 10)	{
			remainder = i % 10;				
			sum = sum + (int)Math.pow((double)remainder, length(number));
		}

		if(sum==number)	return true;
		else return false;
	}

	public static void main(String[] args) {		

		System.out.println(isArmstrong(1));
		System.out.println(isArmstrong(5));
		System.out.println(isArmstrong(9));
		System.out.println(isArmstrong(64));
		System.out.println(isArmstrong(153));
		System.out.println(isArmstrong(155));
		System.out.println(isArmstrong(371));
		System.out.println(isArmstrong(400));
		System.out.println(isArmstrong(1634));
		System.out.println(isArmstrong(1667));
	}
}

