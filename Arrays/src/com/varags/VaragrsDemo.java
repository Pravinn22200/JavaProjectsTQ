package com.varags;

public class VaragrsDemo {

	static void findSum(int ...ar)
	{
		int sum = 0;
		for(int x : ar)
		{
			sum+=x;
			
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
