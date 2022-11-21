package com.brigdelabz.ArrayHandling;

public class SmallestNumber {
	public static void main(String[] args) {
		int[] marks = { 67, 76, 78, 52, 74 };
		int min = Integer.MAX_VALUE;
		for (int e : marks) {
			if (e < min) {
				min = e;
			}
		}
		System.out.println("Samllest Number Of Array is " + min);
	}
}
