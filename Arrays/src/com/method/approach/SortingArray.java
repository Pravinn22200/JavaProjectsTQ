package com.method.approach;

import java.util.Arrays;

public class SortingArray {

	static void sortArray(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[j]<ar[i])
				{
					int temp = ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {2,5,3,1,4,6,8};
		
		System.out.println("Before Sorting : ");
		System.out.println(Arrays.toString(arr));
		
		sortArray(arr);
		
		System.out.println("After sorting : ");
		System.out.println(Arrays.toString(arr));
		
		
	}

}
