package com.brigdelabz.ArrayHandling;

public class PresentOnEvenNumber {
	public static void main(String[] args) {

		int[] marks = { 67, 76, 78, 52, 74 };

		for (int i = 1; i < marks.length; i = i + 2) {
			System.out.println(+marks[i] + " is Present On even Position ");
		}
	}
}