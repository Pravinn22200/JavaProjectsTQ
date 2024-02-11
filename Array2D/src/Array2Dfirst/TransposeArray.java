package Array2Dfirst;

import java.util.Scanner;

public class TransposeArray {

	static int[][] findTranspose(int ar[][],int rows,int cols)
	{
		int tr[][]=new int[cols][rows];
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				tr[j][i]=ar[i][j];
			}
		}
		return tr;
	}
	static void displayMultiArray(int ar[][])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter rows : ");
		int rows = sc.nextInt();
		
		System.out.println("Enter cols : ");
		int cols = sc.nextInt();
		
		int arr[][]= new int[rows][cols];
		
		System.out.println("---------------------------");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the values of rows " +(i+1)+" : ");
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		displayMultiArray(arr);
	}

}
