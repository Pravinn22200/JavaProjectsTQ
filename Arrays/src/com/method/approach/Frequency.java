package com.method.approach;

import java.util.Arrays;

public class Frequency {

	public static void findFrequency(int ar[]) {
		int count;
		boolean status;

		for (int i = 0; i < ar.length; i++) {
			count = 1;
			status = false;

			// check the element is new
			for (int j = i - 1; j >= 0; j--) {
				if (ar[i] == ar[j]) {
					status = true;
					break;
				}
			}
			if (status == false) {
				for (int k = i + 1; k < ar.length; k++) {
					if (ar[i] == ar[k]) {
						count++;

					}
				}
//					 frequency
//				System.out.println(ar[i] + " = " + count);

				// duplicate
//					if(count>1)
//					{
//						System.out.println(ar[i]);
//					}

//				 unique
//					if(count==1)
//					{
//						System.out.println(ar[i]);
//					}
			}

		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 1, 1, 2, 2, 2, 3, 3, 3, 3, 6, 4, 7 };
		findFrequency(a);
		System.out.println(Arrays.toString(a));
	}

}
