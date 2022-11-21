package com.brigdelabz.ArrayHandling;

public class SecondLargestNumber {
	public static void main(String[] args) {

		int[] a = { 67, 76, 78, 52, 74, 67, 52 };
		int temp;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Second largest Number is: " + a[1]);
	}
}
