package com.array.Theory;


public class MinCharArray {

	public static void minChar(char[] ar)
	{
		char min = ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
		}
		System.out.println(min);
	}
	public static void main(String[] args) {
		char[] arr = {'f','b','c','d','e'};
		
		minChar(arr);
		
	}

}
