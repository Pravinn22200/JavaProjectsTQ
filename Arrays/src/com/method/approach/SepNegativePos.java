package com.method.approach;

import java.util.Arrays;

public class SepNegativePos {
	public static void shiftNeg1(int ar[]) {
		int left = 0;
		int right = ar.length - 1;

		while (left < right) {
			while (ar[left] > 0 && left < right)
				left++;
			while (ar[right] < 0 && left < right)
				right++;
			if (left < right) {
				int temp = ar[left];
				ar[left] = ar[right];
				ar[right] = temp;
				left++;
				right--;
			}
		}
	}

	public static void shiftNeg2(int ar[])
		{
			for(int i=1;i<ar.length;i++)
			{
				for(int j =ar.length-1;j>=0;j--)
				{
					if(ar[i]<0 && i<j)
					{
						int temp = ar[j];
						ar[j]=ar[i];
						ar[i]=temp;
					}
				}
			}
		}

	public static void main(String[] args) {
		int[] arr = { 0, -1, 2, -3, 4, 1, 4, -3, -2 };
		System.out.println(Arrays.toString(arr));
//		shiftNeg1(arr);
//		System.out.println(Arrays.toString(arr));
		shiftNeg2(arr);
		System.out.println(Arrays.toString(arr));

	}

}
