package com.brigdelabz.ArrayHandling;

public class FrequencyOfEachElement {
	public static void main(String[] args) {
		int[] marks = { 76, 56, 76, 57, 67, 79, 67 };
		for (int i = 0; i < marks.length; i++) {
			int a = marks[i];
			int count = 0;
			if (a == -1)
				continue;

			for (int j = 0; j < marks.length; j++) {

				if (marks[j] == a) {
					count++;
					marks[j] = -1;
				}
			}

			System.out.println("Frequency of " + a + " is " + count);
		}
	}
}
