package com.brigdelabz.ArrayHandling;

public class LargestNumber {
	public static void main(String[] args) {
		int[] marks = { 67, 76, 78, 52, 74 };
		int max = Integer.MIN_VALUE;
		for (int e : marks) {
			if (e > max) {
				max = e;
			}
		}
		System.out.println("Largest Number In Array is " + max);
	}
}