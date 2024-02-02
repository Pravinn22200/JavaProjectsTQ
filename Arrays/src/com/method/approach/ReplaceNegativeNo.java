package com.method.approach;

import java.util.Arrays;

public class ReplaceNegativeNo {

	public static void replaceWithZero(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
			{
				ar[i]=0;
			}
		}
		System.out.println(Arrays.toString(ar));
		
	}
	public static void main(String[] args) {
		int a[]= {4,-1,5,-9,4};
		replaceWithZero(a);
		
	}

}
