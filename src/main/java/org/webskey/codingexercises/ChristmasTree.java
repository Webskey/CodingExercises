package org.webskey.codingexercises;

public class ChristmasTree {
	public static void main(String[] args) {
		String star = "*";
		String space = " ";
		int height = 15;
		int starNum = 1;
		while(height > 0) {
			String treeRow = "";
			for(int i = height; i > 0; i--)
				treeRow += space;
			height--;
			for(int i = starNum; i > 0; i--)
				treeRow += star;
			starNum += 2;
			System.out.println(treeRow);
		}
	}
}
