package com.brigdelabz.ArrayHandling;

public class ElementsOfAnArray {
	public static void main(String[] args) {
		int[] marks = new int[8];
		{
			marks[0] = 78;
			marks[1] = 76;
			marks[2] = 69;
			marks[3] = 61;
			marks[4] = 63;
			marks[5] = 65;
			marks[6] = 67;
			marks[7] = 79;
			System.out.println("Elements Of Array are");
			for (int i = 0; i < marks.length; i++) {
				System.out.println(marks[i]);

			}
		}
	}
}