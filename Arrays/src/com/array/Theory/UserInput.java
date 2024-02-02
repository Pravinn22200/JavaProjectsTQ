package com.array.Theory;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of an array : ");
		int size= sc.nextInt();
		int arr[]= new int[size];
		
		System.out.println("Enter elements of an array : ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("listr of array  : ");
		for(int i=0;i<size;i++)
		{
			if(i%2==0)
			{
			System.out.println(arr[i]);
			}
		}
	}

}
