package com.brigdelabz.ArrayHandling;

public class AscendingOrder {
	public static void main(String[] args) {

		int[] marks = { 67, 76, 78, 52, 74, 67, 52 };

		int start = 0;

		for (int i = 0; i < marks.length; i++) {

			for (int j = i + 1; j < marks.length; j++) {
				if (marks[i] > marks[j]) {
					start = marks[i];
					marks[i] = marks[j];
					marks[j] = start;
				}
			}
		}
		System.out.println("Ascending Order Of given Array is");
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i] + " ");
		}
	}
}
