package com.method.approach;

import java.util.Scanner;

public class SearchEleIndex {

	

	public static int searchElement(int[] ar, int ele) {
		int i, count = 0,index;
		for (i = 0; i < ar.length; i++) {
			if (ar[i] == ele) {
				count++;
				index = i;
				System.out.println(index);

			}
		}
		return count;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = { 45, 85, 54, 45, 85, 65 };
		System.out.println("Enter an element to search : ");
		int element = sc.nextInt();
		System.out.println("index : ");
		int count = searchElement(arr, element);
		
		
		System.out.println("count : " + count);

	}

}
