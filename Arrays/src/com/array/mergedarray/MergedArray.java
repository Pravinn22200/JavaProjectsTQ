
package com.array.mergedarray;
import java.util.Arrays;

public class MergedArray {

	public static int[] mergedArray(int ar1[], int ar2[])
	{
		int len1 = ar1.length;
		int len2 = ar2.length;
		int[] merg=  new int[len1+len2];
		int index = 0;
		for(int i=0;i<ar1.length;i++)
		{
			merg[index++]=ar1[i];
		}
		for(int i=0;i<ar2.length;i++)
		{
			merg[index++]=ar2[i];
		}
		return merg;
	}
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {7,8,9,10,11,12};
		
		int merge[] = mergedArray(arr1, arr2);
		
		System.out.println(Arrays.toString(merge));
	}

}
