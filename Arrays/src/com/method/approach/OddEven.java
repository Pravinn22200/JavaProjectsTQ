package com.method.approach;

import java.util.Arrays;

public class OddEven {

	public static void evenOdd(int[] ar) {
		int[] even = new int[ar.length];
		int[] odd = new int[ar.length];
		int i, index1 = 0, index2 = 0;

		for (i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				even[index1++] = ar[i];
			} else {
				odd[index2++] = ar[i];
			}
		}
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));
	}

	public static void main(String[] args) {

		int[] arr = { 45, 15, 24, 64, 23, 28, 78, 89 };
		evenOdd(arr);

	}

}