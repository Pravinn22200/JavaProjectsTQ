package com.array.Theory;

public class SumOfArray {
	public static void main(String args[])
	{	
		int sum=0;
		int arr[]= new int[5];
		arr[0]=10;
		arr[1]=11;
		arr[2]=12;
		arr[3]=13;
		arr[4]=14;
		
		for (int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		
		}
		System.out.println(sum);
		
	}
	
}
