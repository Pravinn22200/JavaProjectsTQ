package com.method.approach;

public class ElementsSum {

	public static void findSumEle(int ar[], int sum) {
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] + ar[j] == sum) {
					System.out.println(ar[i] + " " + ar[j]);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		findSumEle(arr, 7);
	}

}
