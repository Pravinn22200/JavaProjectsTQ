package com.method.approach;

public class SecondMax {
	static int findSecondHighest(int ar[]) {
		int highest = ar[0];
		int secHighest = ar[0];
//
//		for (int x : ar) {
//			if (x > highest) {
//				secHighest = highest;
//				highest = x;
//			} else if (x > secHighest) {
//				secHighest = x;
//			}
//
//		}

		for (int i=0;i<ar.length;i++) {
			if (ar[i] > highest) {
				secHighest = highest;
				highest =ar[i];
			}
			else if(ar[i]>secHighest)
			{
				secHighest=ar[i];
			}
			
		}
		return secHighest;
	}

	public static void main(String[] args) {

		int arr[] = { -2, -5, 4, 6, -8, 9, 7, };
	}

}
