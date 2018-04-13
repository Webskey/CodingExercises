package org.webskey.codingexecises;

public class IsPrimal {

	public boolean isPrimal(int num) {
		if(num==1 || num==0)
			return false;
		for(int i = 2; i < num; i++)
			if((num % i) == 0)
				return false;
		return true;
	}
	public static void main(String[] args) {
		IsPrimal ip = new IsPrimal();
		System.out.println(ip.isPrimal(16));

		System.out.println(ip.isPrimal(6));

		System.out.println(ip.isPrimal(1));
		
		System.out.println(ip.isPrimal(0));

		System.out.println(ip.isPrimal(2));

		System.out.println(ip.isPrimal(17));

		System.out.println(ip.isPrimal(9));

		System.out.println(ip.isPrimal(23));

	}

}
