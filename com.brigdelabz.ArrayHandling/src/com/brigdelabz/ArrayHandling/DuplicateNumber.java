package com.brigdelabz.ArrayHandling;

public class DuplicateNumber {
	public static void main(String[] args) {

		int[] marks = { 67, 76, 78, 52, 74, 67, 52 };

		for (int i = 0; i < marks.length; i++) {
			for (int j = i + 1; j < marks.length; j++) {
				if (marks[i] == marks[j])

					System.out.println(marks[j] + " is Duplicate Number");
			}
		}
	}
}
