package com.method.approach;

public class SumOfPrimeNo {

	public static boolean checkPrime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		else {
			boolean flag=true;
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					flag=false;
					break;
				}
			}
			return flag;
		}
	}
	public static void main(String[] args) {
		int[] arr= {45,56,12,23,78,98,17};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(checkPrime(arr[i]))
			{
				sum=sum+arr[i];
			}
		}
		System.out.println("Sum : "+sum);
	}

}
