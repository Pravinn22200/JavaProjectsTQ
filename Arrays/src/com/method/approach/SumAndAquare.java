package com.method.approach;

import java.util.Arrays;

public class SumAndAquare {
	
	int sumOfEvenElements(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
			sum+= arr[i];
			}
		}
		return sum;
	}
	static void squareElements(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=ar[i]*ar[i];
		}
		System.out.println("Square : ");
		System.out.println(Arrays.toString(ar));
	}
	int sumOfElements(int ar[])
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum+=ar[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		
		int arr[]= {4,5,6,2,7};
		int ar[] = {8,7,8,9,4};
		
//		System.out.println("arr : "+arr);
//		System.out.println("ar : "+ar);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(ar));
		
		SumAndAquare.squareElements(ar);
		SumAndAquare s1 = new SumAndAquare();
		
		System.out.println("Sum of Elemnts : "+s1.sumOfElements(arr));
		System.out.println("Sum of even Elemnts : "+s1.sumOfEvenElements(arr));

	}

}
